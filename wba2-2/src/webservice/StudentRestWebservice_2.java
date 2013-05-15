package webservice;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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

public class StudentRestWebservice_2 {
	
	private String xmlPath = "/student1.xml";
	
	@GET
	@Path("/studenten/{id}")
	@Produces("application/xml")
	
	public Student getStudent() throws JAXBException, FileNotFoundException
	{
		ObjectFactory ob = new ObjectFactory();
		Studenten student = ob.createStudenten();
		JAXBContext context = JAXBContext.newInstance(Studenten.class);
		javax.xml.bind.Unmarshaller um = context.createUnmarshaller();
		student = (Studenten) um.unmarshal( new FileReader("xmlPath"));
		return getStudent();
	}

	@GET
	@Path("/studenten/{id}")
	@Produces("application/xml")

	
	public Studenten getOne(@PathParam("id") int id) throws JAXBException, FileNotFoundException
	{
		ObjectFactory ob = new ObjectFactory();
		Studenten student = ob.createStudenten();
		JAXBContext context = JAXBContext.newInstance(Studenten.class);
		javax.xml.bind.Unmarshaller um = context.createUnmarshaller();
		student = (Studenten) um.unmarshal(new FileReader(xmlPath));
		Studenten rt = ob.createStudenten();
		rt.getStudent().add(student.getStudent().get(id-1));
		return rt;
	}
	
	@POST
	@Path("/studenten")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Studenten addOne(Studenten student)
	{
		Studenten Studenten = new Studenten();
		int id = 0;
		
		try
		{
			JAXBContext context = JAXBContext.newInstance(Studenten.class);
			javax.xml.bind.Unmarshaller um = context.createUnmarshaller();
			Studenten = (Studenten)um.unmarshal(new FileReader(xmlPath));
			
			for(Student temp : Studenten.getStudenten())
			{
				if(id <= temp.getId())
				{
					id = temp.getId()+1;
				}
			}
			
			student.getStudent().get(0).setId(id);
			localStudenten.getStudent().add(studenten.getStudent().get(0));
			Marshaller mar = context.createMarshaller();
			mar.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
			mar.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, "../student.xsd");
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			mar.marshal(localStudenten, new FileWriter(xmlPath));
			
			return null;
		
		
		}
	}
}
