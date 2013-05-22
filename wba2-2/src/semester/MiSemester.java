//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.17 um 04:50:12 PM CEST 
//


package semester;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="semester">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="zeitpunkt">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="kuerzel" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="modulplan">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="modul" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="dozent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="credits" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="aufwand" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="termin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "semester"
})
@XmlRootElement(name = "mi_semester")
public class MiSemester {

    @XmlElement(required = true)
    protected MiSemester.Semester semester;

    /**
     * Ruft den Wert der semester-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MiSemester.Semester }
     *     
     */
    public MiSemester.Semester getSemester() {
        return semester;
    }

    /**
     * Legt den Wert der semester-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MiSemester.Semester }
     *     
     */
    public void setSemester(MiSemester.Semester value) {
        this.semester = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="zeitpunkt">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="kuerzel" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="modulplan">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="modul" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="dozent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="credits" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="aufwand" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="termin" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "zeitpunkt",
        "modulplan"
    })
    public static class Semester {

        @XmlElement(required = true)
        protected MiSemester.Semester.Zeitpunkt zeitpunkt;
        @XmlElement(required = true)
        protected MiSemester.Semester.Modulplan modulplan;

        /**
         * Ruft den Wert der zeitpunkt-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link MiSemester.Semester.Zeitpunkt }
         *     
         */
        public MiSemester.Semester.Zeitpunkt getZeitpunkt() {
            return zeitpunkt;
        }

        /**
         * Legt den Wert der zeitpunkt-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link MiSemester.Semester.Zeitpunkt }
         *     
         */
        public void setZeitpunkt(MiSemester.Semester.Zeitpunkt value) {
            this.zeitpunkt = value;
        }

        /**
         * Ruft den Wert der modulplan-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link MiSemester.Semester.Modulplan }
         *     
         */
        public MiSemester.Semester.Modulplan getModulplan() {
            return modulplan;
        }

        /**
         * Legt den Wert der modulplan-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link MiSemester.Semester.Modulplan }
         *     
         */
        public void setModulplan(MiSemester.Semester.Modulplan value) {
            this.modulplan = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="modul" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="dozent" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="credits" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="aufwand" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="termin" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "modul"
        })
        public static class Modulplan {

            protected List<MiSemester.Semester.Modulplan.Modul> modul;

            /**
             * Gets the value of the modul property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the modul property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getModul().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MiSemester.Semester.Modulplan.Modul }
             * 
             * 
             */
            public List<MiSemester.Semester.Modulplan.Modul> getModul() {
                if (modul == null) {
                    modul = new ArrayList<MiSemester.Semester.Modulplan.Modul>();
                }
                return this.modul;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="dozent" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="credits" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="aufwand" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="termin" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "titel",
                "dozent"
            })
            public static class Modul {

                @XmlElement(required = true)
                protected String titel;
                @XmlElement(required = true)
                protected String dozent;
                @XmlAttribute(name = "credits")
                protected String credits;
                @XmlAttribute(name = "aufwand")
                protected String aufwand;
                @XmlAttribute(name = "termin")
                protected String termin;

                /**
                 * Ruft den Wert der titel-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTitel() {
                    return titel;
                }

                /**
                 * Legt den Wert der titel-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTitel(String value) {
                    this.titel = value;
                }

                /**
                 * Ruft den Wert der dozent-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDozent() {
                    return dozent;
                }

                /**
                 * Legt den Wert der dozent-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDozent(String value) {
                    this.dozent = value;
                }

                /**
                 * Ruft den Wert der credits-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCredits() {
                    return credits;
                }

                /**
                 * Legt den Wert der credits-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCredits(String value) {
                    this.credits = value;
                }

                /**
                 * Ruft den Wert der aufwand-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAufwand() {
                    return aufwand;
                }

                /**
                 * Legt den Wert der aufwand-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAufwand(String value) {
                    this.aufwand = value;
                }

                /**
                 * Ruft den Wert der termin-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTermin() {
                    return termin;
                }

                /**
                 * Legt den Wert der termin-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTermin(String value) {
                    this.termin = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="kuerzel" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Zeitpunkt {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "kuerzel")
            @XmlSchemaType(name = "anySimpleType")
            protected String kuerzel;

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Ruft den Wert der kuerzel-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKuerzel() {
                return kuerzel;
            }

            /**
             * Legt den Wert der kuerzel-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKuerzel(String value) {
                this.kuerzel = value;
            }

        }

    }

}
