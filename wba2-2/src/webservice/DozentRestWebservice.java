package webservice;

import java.io.File;
import java.io.FileNotFoundException;

import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import dozenten.Dozenten;
import dozenten.Dozenten.Dozent;
import dozenten.ObjectFactory;

@Path ("/dozenten")
public class DozentRestWebservice {

	@GET
	@Produces("application/xml")
	public Dozenten getAll() throws JAXBException, FileNotFoundException
	{
		ObjectFactory ob = new ObjectFactory();
		Dozenten dozent = ob.createDozenten();
		JAXBContext context = JAXBContext.newInstance(Dozenten.class);
		Unmarshaller um = context.createUnmarshaller();
		dozent = (Dozenten) um.unmarshal(new File("/Users/Butterfly/git/wba2_phase1/wba2-2/src/dozent1.xml"));
		
		return dozent;
	}
	
	@GET
	@Path("/dozenten/{id}")
	@Produces("application/xml")
	public Dozenten getOne(@PathParam("id") int id) throws JAXBException, FileNotFoundException
	{
		ObjectFactory ob = new ObjectFactory();
		Dozenten dozent = ob.createDozenten();
		JAXBContext context = JAXBContext.newInstance(Dozenten.class);
		Unmarshaller um = context.createUnmarshaller();
		dozent = (Dozenten) um.unmarshal(new File("/Users/Butterfly/git/wba2_phase1/wba2-2/src/dozent1.xml"));
		Dozenten doz = ob.createDozenten();
		doz.getDozent().add(dozent.getDozent().get(id-1));
		
		return doz;
	}
}
