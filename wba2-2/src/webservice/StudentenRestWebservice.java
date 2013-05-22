package webservice;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigInteger;
import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sun.jersey.api.NotFoundException;
import com.sun.xml.internal.ws.util.Pool.Unmarshaller;

import studenten.ObjectFactory;
import studenten.Studenten;
import studenten.Studenten.Student;


@Path("/studenten")

public class StudentenRestWebservice {
	
	private String xmlPath = "/student1.xml";
	
	@GET
	@Path("/student")
	@Produces(MediaType.APPLICATION_XML)
	
	public Studenten getStudent(@PathParam("id") int id) throws JAXBException, FileNotFoundException
	{
		ObjectFactory ob = new ObjectFactory();
		Studenten student = ob.createStudenten();
		JAXBContext context = JAXBContext.newInstance(Studenten.class);
		javax.xml.bind.Unmarshaller um = context.createUnmarshaller();
		student = (Studenten) um.unmarshal( new FileReader("xmlPath"));
		return student;
	}

	@GET
	@Path("/student/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Studenten getOne(@PathParam("id") String id) throws JAXBException, FileNotFoundException
	{
		int idNum = Integer.parseInt(id);
		Studenten student = new Studenten();
		JAXBContext context = JAXBContext.newInstance(Studenten.class);
		javax.xml.bind.Unmarshaller um = context.createUnmarshaller();
		student = (Studenten) um.unmarshal(new FileReader(xmlPath));
		student.getStudent().add(student.getStudent().get(idNum));
		return student;
	}
	
	@POST
	@Path("/student")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Studenten addOne(Studenten student)
	{
		Studenten localStudenten = new Studenten();
		int id = 0;
		
		try
		{
			JAXBContext context = JAXBContext.newInstance(Studenten.class);
			javax.xml.bind.Unmarshaller um = context.createUnmarshaller();
			localStudenten = (Studenten)um.unmarshal(new FileReader(xmlPath));
			
			for(Student temp : localStudenten.getStudent())
			{
				if(id <= temp.getId().intValue())
				{
					id = temp.getId().intValue()+1;
				}
			}
			
			student.getStudent().get(0).setId(BigInteger.valueOf(id));
			localStudenten.getStudent().add(student.getStudent().get(0));
			Marshaller mar = context.createMarshaller();
			mar.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
			mar.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, "../student.xsd");
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			mar.marshal(localStudenten, new FileWriter(xmlPath));
			
			return null;
		}
		catch(Exception e)
		{
			
		}
		
		return null;
	}
}
