//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.17 um 04:50:12 PM CEST 
//


package semester;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the semester package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: semester
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MiSemester }
     * 
     */
    public MiSemester createMiSemester() {
        return new MiSemester();
    }

    /**
     * Create an instance of {@link MiSemester.Semester }
     * 
     */
    public MiSemester.Semester createMiSemesterSemester() {
        return new MiSemester.Semester();
    }

    /**
     * Create an instance of {@link MiSemester.Semester.Modulplan }
     * 
     */
    public MiSemester.Semester.Modulplan createMiSemesterSemesterModulplan() {
        return new MiSemester.Semester.Modulplan();
    }

    /**
     * Create an instance of {@link MiSemester.Semester.Zeitpunkt }
     * 
     */
    public MiSemester.Semester.Zeitpunkt createMiSemesterSemesterZeitpunkt() {
        return new MiSemester.Semester.Zeitpunkt();
    }

    /**
     * Create an instance of {@link MiSemester.Semester.Modulplan.Modul }
     * 
     */
    public MiSemester.Semester.Modulplan.Modul createMiSemesterSemesterModulplanModul() {
        return new MiSemester.Semester.Modulplan.Modul();
    }

}
