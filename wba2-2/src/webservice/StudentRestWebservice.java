package webservice;

import java.io.FileReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


import studenten.Studenten;
import studenten.Studenten.Student;


@Path("/studenten")

public class StudentRestWebservice
{
	private String xmlPath = "/student1.xml";
	
	@GET
	@Path("/studenten/{id}")
	@Produces("application/xml")
	
	public Studenten getOne(@PathParam("id") int id)
	{
		Studenten student = new Studenten();
		
		try
		{
			JAXBContext context = JAXBContext.newInstance(Studenten.class);
			Unmarshaller um = context.createUnmarshaller();
			Object studenten = (Studenten)um.unmarshal(new FileReader(xmlPath));
						
			for(Student temp : studenten.getStudent())
			{
				if(id == temp.getid())
				{
					student.getStudent().add(temp);
					return student;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("ERROR: " + e.getMessage()); System.exit(-1);
		}
		
		return student;
	}
	
	
	
	/**Einen Student hinzufuegen
	 * Eine eindeutige id wird automatisch vergeben.
	 * 
	 * @param studenten Einen Student das hinzugefuegt werden soll
	 * @return Student das neu hinzugefuegt worden ist mit der neuen id
	 */
	@POST
	@Path("/student")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Studenten addOne(Studenten studenten)
	{
		Studenten localStudenten = new Studenten();
		int id = 0;
		
		try
		{
			JAXBContext context = JAXBContext.newInstance(Studenten.class);
			Unmarshaller um = context.createUnmarshaller();
			localStudenten = (Studenten)um.unmarshal(new FileReader(xmlPath));
			
			for(Student temp : localStudenten.getStudent())
			{
				if(id <= temp.getId())
				{
					id = temp.getId()+1;
				}
			}
			
			studenten.getStudent().get(0).setId(id);
			localStudenten.getStudent().add(studenten.getStudent().get(0));
			Marshaller mar = context.createMarshaller();
			mar.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
			mar.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, "/student.xsd");
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			mar.marshal(localStudenten, new FileWriter(xmlPath));
			
			return studenten;
		}
		catch(Exception e)
		{
			System.out.println("ERROR: " + e.getMessage()); System.exit(-1);
		}
		
		return null;
	}
	
	
	
	/**Einen Studenten loeschen
	 * 
	 * @param id Die ID der zu loeschenden Student
	 */
	@DELETE
	@Path("/student/{id}")
	public void deleteOne(@PathParam("id") int id)
	{
		Studenten studenten = new Studenten();
		
		try
		{
			JAXBContext context = JAXBContext.newInstance(Studenten.class);
			Unmarshaller um = context.createUnmarshaller();
			studenten = (Studenten)um.unmarshal(new FileReader(xmlPath));
			boolean foundet = false;
			
			for(int i=0; i<studenten.getStudent().size(); i++)
			{
				if(studenten.getStudent().get(i).getId() == id)
				{
					studenten.getStudent().remove(i);
					foundet = true;
					break;
				}
			}
			
			if(foundet)
			{
				Marshaller mar = context.createMarshaller();
				mar.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
				mar.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, "/student.xsd");
				mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				mar.marshal(studenten, new FileWriter(xmlPath));
			}
		}
		catch(Exception e)
		{
			System.out.println("ERROR: " + e.getMessage()); System.exit(-1);
		}
	}
}