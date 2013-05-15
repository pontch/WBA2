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
		public void getOne(@PathParam("id") int id)throws JAXBException, FileNotFoundException
		{
			
			//jaxb Objekt erstellen
			JAXBContext jc = JAXBContext.newInstance(Dozenten.class);
			//Unmarshaller, der XML-Dokumente in Java-Objekte konvertiert
	        Unmarshaller unmarshaller = jc.createUnmarshaller();
	        Dozenten dozent = (Dozenten) unmarshaller.unmarshal(new File("/Users/Butterfly/git/wba2_phase1/wba2-2/src/dozent1.xml"));
	            
	        	//zur Person
	         	System.out.println("Name: " + dozent.getDozent().get(id).getTitel());
	            System.out.println("Adresse: \n");
	            System.out.println("" + dozent.getDozent().get(id).getAdresse().anschrift);
	            System.out.println(dozent.getDozent().get(id).getAdresse().getRaum().titel + " " + dozent.getDozent().get(id).getAdresse().getRaum().nummer);
	            System.out.println("Telefon/Fax: " + dozent.getDozent().get(id).getAdresse().getTel().getNummer().get(1));
	            System.out.println("" + dozent.getDozent().get(id).getAdresse().email);    

	            //Lehre
	            System.out.println("Lehre: \n");
	            System.out.println("Lehrgebiet: " + dozent.getDozent().get(id).getLehre().lehrgebiet);
	            System.out.println("Schwerpunkte: " + dozent.getDozent().get(id).getLehre().schwerpunkte);
	            System.out.println("URL: " + dozent.getDozent().get(id).getLehre().url);
	            System.out.println("Sprechzeiten: " + dozent.getDozent().get(id).getLehre().sprechzeit);
	            
	            for(int i=0; i<dozent.getDozent().get(id).getLehre().getVeranstaltungen().getList().size(); i++){
	            	System.out.println("" + dozent.getDozent().get(id).getLehre().getVeranstaltungen().getList().get(i).getKuerzel() + " - " + dozent.getDozent().get(id).getLehre().getVeranstaltungen().getList().get(i).value);
	            }
	            	
	            //News
	            if(dozent.getDozent().get(id).getNewsticker().eintrag != null)
	            {
	            	for(int k=0; k<dozent.getDozent().get(id).getNewsticker().getEintrag().size(); k++ )
	            	{
	            		System.out.println("Datum: " + dozent.getDozent().get(id).getNewsticker().getEintrag().get(k).datum);
	            		System.out.println("Verfasser: " + dozent.getDozent().get(id).getNewsticker().getEintrag().get(k).verfasser);
	            		System.out.println("Modul: " + dozent.getDozent().get(id).getNewsticker().getEintrag().get(k).modul);
	            		System.out.println("News: " + dozent.getDozent().get(id).getNewsticker().getEintrag().get(k).text);
	            	}
	            }
	           
	            //Abonnenten
	            if(dozent.getDozent().get(id).getAbonnenten().abonnent != null)
	            {
	            	for(int i=0; i<dozent.getDozent().get(id).getAbonnenten().getAbonnent().size(); i++)
	            	{
	            		 System.out.println("Abonnenten: \n");
	            		 System.out.println("" + dozent.getDozent().get(id).getAbonnenten().abonnent);
	            	}
	            }
	           
	            
		}
		
		/**Alle Dozenten anfordern
		 * 
		 * @return Alle Dozenten
		 */
		@GET
		@Produces("application/xml")
		public void getAll() throws JAXBException, FileNotFoundException
		{
			//jaxb Objekt erstellen
			JAXBContext jc = JAXBContext.newInstance(Dozenten.class);
			//Unmarshaller, der XML-Dokumente in Java-Objekte konvertiert
	        Unmarshaller unmarshaller = jc.createUnmarshaller();
	        Dozenten dozent = (Dozenten) unmarshaller.unmarshal(new File("/Users/Butterfly/git/wba2_phase1/wba2-2/src/dozent1.xml"));
	        
			for(int i=0; i<dozent.getDozent().size(); i++)
			{
				System.out.println(dozent.getDozent().get(i).getId() + ". " + dozent.getDozent().get(i).titel);
			}
		}

		 
	}
}
