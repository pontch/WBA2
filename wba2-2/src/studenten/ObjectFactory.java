//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.17 um 04:48:32 PM CEST 
//


package studenten;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the studenten package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: studenten
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Studenten }
     * 
     */
    public Studenten createStudenten() {
        return new Studenten();
    }

    /**
     * Create an instance of {@link Studenten.Student }
     * 
     */
    public Studenten.Student createStudentenStudent() {
        return new Studenten.Student();
    }

    /**
     * Create an instance of {@link Studenten.Student.Abos }
     * 
     */
    public Studenten.Student.Abos createStudentenStudentAbos() {
        return new Studenten.Student.Abos();
    }

    /**
     * Create an instance of {@link Studenten.Student.Abos.Module }
     * 
     */
    public Studenten.Student.Abos.Module createStudentenStudentAbosModule() {
        return new Studenten.Student.Abos.Module();
    }

    /**
     * Create an instance of {@link Studenten.Student.Name }
     * 
     */
    public Studenten.Student.Name createStudentenStudentName() {
        return new Studenten.Student.Name();
    }

    /**
     * Create an instance of {@link Studenten.Student.Studiengang }
     * 
     */
    public Studenten.Student.Studiengang createStudentenStudentStudiengang() {
        return new Studenten.Student.Studiengang();
    }

    /**
     * Create an instance of {@link Studenten.Student.Semester }
     * 
     */
    public Studenten.Student.Semester createStudentenStudentSemester() {
        return new Studenten.Student.Semester();
    }

    /**
     * Create an instance of {@link Studenten.Student.Email }
     * 
     */
    public Studenten.Student.Email createStudentenStudentEmail() {
        return new Studenten.Student.Email();
    }

    /**
     * Create an instance of {@link Studenten.Student.Abos.Dozenten }
     * 
     */
    public Studenten.Student.Abos.Dozenten createStudentenStudentAbosDozenten() {
        return new Studenten.Student.Abos.Dozenten();
    }

    /**
     * Create an instance of {@link Studenten.Student.Abos.Module.Modul }
     * 
     */
    public Studenten.Student.Abos.Module.Modul createStudentenStudentAbosModuleModul() {
        return new Studenten.Student.Abos.Module.Modul();
    }

}
