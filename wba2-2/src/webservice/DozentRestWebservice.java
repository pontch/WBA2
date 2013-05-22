package webservice;

import java.io.FileReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import dozenten.Dozenten;
import dozenten.Dozenten.Dozent;

@Path("/classDozent")
public class DozentRestWebservice {
  
	private String xmlPath ="/dozenten1.xml";
	
	/**Dozent laden
	 * 
	 * @param id Eine ID des Dozenten der zurückgegeben werden soll
	 * @return Ein Dozent
	 */
	@GET
	@Path("/dozenten/{id}")
	@Produces("application/xml")
	public Dozenten getOne(@PathParam("id") int id){
		
		Dozenten dozenten = new Dozenten();
		
		try
		{
			JAXBContext context = JAXBContext.newInstance(Dozenten.class);
			Unmarshaller um = context.createUnmarshaller();
			dozenten =(Dozenten)um.unmarshal(new FileReader(xmlPath));
			Dozenten dozent = new Dozenten();
			
			for(Dozent temp : dozenten.getDozent())
			{
				if(id == temp.getId().intValue())
				{
					dozent.getDozent().add(temp);
					return dozent;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("ERROR: " + e.getMessage()); System.exit(-1);
		}
		return null;
	}
	
	/**Alle Dozenten anfordern
	 * 
	 * @return Alle Dozenten
	 */
	@GET
	@Produces("application/xml")
	public Dozenten getAll()
	{
		Dozenten dozenten = new Dozenten();
		
		try
		{
			JAXBContext context = JAXBContext.newInstance(Dozenten.class);
			Unmarshaller um = context.createUnmarshaller();
			dozenten = (Dozenten)um.unmarshal(new FileReader(xmlPath));
		}
		catch(Exception e)
		{
			System.out.println("ERROR:" + e.getMessage()); System.exit(-1);
		}
		return dozenten;
	}
}
