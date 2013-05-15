package dozenten;


import javax.ws.rs.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.*;

public class DozentenService {

	@Path("/dozenten")
	public class DozentRestWebservice {

		/**Dozent laden
		 * 
		 * @param id Eine ID des Dozenten der zurückgegeben werden soll
		 * @return Ein Dozent
		 */
		
		@Path("/dozenten/{id}")
		@GET
		public void getOne(@PathParam("id") int id)throws JAXBException, FileNotFoundException{
			
			JAXBContext jc = JAXBContext.newInstance(Dozenten.class);
	        Unmarshaller unmarshaller = jc.createUnmarshaller();
	        Dozenten dozenten = (Dozenten) unmarshaller.unmarshal(new File("/Users/Butterfly/git/wba2_phase1/wba2-2/src/dozent1.xml"));
	            
	         	System.out.println("Name: " + dozenten.getDozent().get(id).getTitel());
	            System.out.println("Adresse: \n");
	            System.out.println("" + dozenten.getDozent().get(id).getAdresse().anschrift);
	            System.out.println(dozenten.getDozent().get(id).getAdresse().getRaum().titel + " " + dozenten.getDozent().get(id).getAdresse().getRaum().nummer);
	            System.out.println("Telefon/Fax: " + dozenten.getDozent().get(id).getAdresse().getTel().getNummer().get(1));
	            System.out.println("" + dozenten.getDozent().get(id).getAdresse().email);    

	            System.out.println("Lehre: \n");
	            

		}
		
		 
	}
}
