//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.17 um 04:50:48 PM CEST 
//


package dozenten;

import java.math.BigInteger;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="dozent" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="titel">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="kategorie" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="adresse">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="anschrift" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="raum">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="nummer" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="tel">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nummer" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="nr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="email">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="lehre">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lehrgebiet" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="schwerpunkte" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="sprechzeit" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="veranstaltungen">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="list" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="kuerzel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="newsticker">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="eintrag" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="verfasser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="modul" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="abonnenten">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="abonnent" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    "dozent"
})
@XmlRootElement(name = "dozenten")
public class Dozenten {

    @XmlElement(required = true)
    protected java.util.List<Dozenten.Dozent> dozent;

    /**
     * Gets the value of the dozent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dozent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDozent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dozenten.Dozent }
     * 
     * 
     */
    public java.util.List<Dozenten.Dozent> getDozent() {
        if (dozent == null) {
            dozent = new ArrayList<Dozenten.Dozent>();
        }
        return this.dozent;
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
     *         &lt;element name="titel">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="kategorie" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="adresse">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="anschrift" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="raum">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="nummer" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="tel">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nummer" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="nr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="email">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="lehre">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="lehrgebiet" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="schwerpunkte" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="sprechzeit" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="veranstaltungen">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="list" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="kuerzel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="newsticker">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="eintrag" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="verfasser" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="modul" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="abonnenten">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="abonnent" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
        "adresse",
        "lehre",
        "newsticker",
        "abonnenten"
    })
    public static class Dozent {

        @XmlElement(required = true)
        protected Dozenten.Dozent.Titel titel;
        @XmlElement(required = true)
        protected Dozenten.Dozent.Adresse adresse;
        @XmlElement(required = true)
        protected Dozenten.Dozent.Lehre lehre;
        @XmlElement(required = true)
        protected Dozenten.Dozent.Newsticker newsticker;
        @XmlElement(required = true)
        protected Dozenten.Dozent.Abonnenten abonnenten;
        @XmlAttribute(name = "id")
        protected BigInteger id;

        /**
         * Ruft den Wert der titel-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Dozenten.Dozent.Titel }
         *     
         */
        public Dozenten.Dozent.Titel getTitel() {
            return titel;
        }

        /**
         * Legt den Wert der titel-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Dozenten.Dozent.Titel }
         *     
         */
        public void setTitel(Dozenten.Dozent.Titel value) {
            this.titel = value;
        }

        /**
         * Ruft den Wert der adresse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Dozenten.Dozent.Adresse }
         *     
         */
        public Dozenten.Dozent.Adresse getAdresse() {
            return adresse;
        }

        /**
         * Legt den Wert der adresse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Dozenten.Dozent.Adresse }
         *     
         */
        public void setAdresse(Dozenten.Dozent.Adresse value) {
            this.adresse = value;
        }

        /**
         * Ruft den Wert der lehre-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Dozenten.Dozent.Lehre }
         *     
         */
        public Dozenten.Dozent.Lehre getLehre() {
            return lehre;
        }

        /**
         * Legt den Wert der lehre-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Dozenten.Dozent.Lehre }
         *     
         */
        public void setLehre(Dozenten.Dozent.Lehre value) {
            this.lehre = value;
        }

        /**
         * Ruft den Wert der newsticker-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Dozenten.Dozent.Newsticker }
         *     
         */
        public Dozenten.Dozent.Newsticker getNewsticker() {
            return newsticker;
        }

        /**
         * Legt den Wert der newsticker-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Dozenten.Dozent.Newsticker }
         *     
         */
        public void setNewsticker(Dozenten.Dozent.Newsticker value) {
            this.newsticker = value;
        }

        /**
         * Ruft den Wert der abonnenten-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Dozenten.Dozent.Abonnenten }
         *     
         */
        public Dozenten.Dozent.Abonnenten getAbonnenten() {
            return abonnenten;
        }

        /**
         * Legt den Wert der abonnenten-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Dozenten.Dozent.Abonnenten }
         *     
         */
        public void setAbonnenten(Dozenten.Dozent.Abonnenten value) {
            this.abonnenten = value;
        }

        /**
         * Ruft den Wert der id-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Legt den Wert der id-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
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
         *         &lt;element name="abonnent" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "abonnent"
        })
        public static class Abonnenten {

            protected java.util.List<Dozenten.Dozent.Abonnenten.Abonnent> abonnent;

            /**
             * Gets the value of the abonnent property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the abonnent property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAbonnent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Dozenten.Dozent.Abonnenten.Abonnent }
             * 
             * 
             */
            public java.util.List<Dozenten.Dozent.Abonnenten.Abonnent> getAbonnent() {
                if (abonnent == null) {
                    abonnent = new ArrayList<Dozenten.Dozent.Abonnenten.Abonnent>();
                }
                return this.abonnent;
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
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Abonnent {

                @XmlAttribute(name = "name")
                protected String name;

                /**
                 * Ruft den Wert der name-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Legt den Wert der name-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
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
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="anschrift" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="raum">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="nummer" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="tel">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nummer" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="nr" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="email">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "anschrift",
            "raum",
            "tel",
            "email"
        })
        public static class Adresse {

            @XmlElement(required = true)
            protected String anschrift;
            @XmlElement(required = true)
            protected Dozenten.Dozent.Adresse.Raum raum;
            @XmlElement(required = true)
            protected Dozenten.Dozent.Adresse.Tel tel;
            @XmlElement(required = true)
            protected Dozenten.Dozent.Adresse.Email email;
            @XmlAttribute(name = "titel")
            protected String titel;

            /**
             * Ruft den Wert der anschrift-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnschrift() {
                return anschrift;
            }

            /**
             * Legt den Wert der anschrift-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnschrift(String value) {
                this.anschrift = value;
            }

            /**
             * Ruft den Wert der raum-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Dozenten.Dozent.Adresse.Raum }
             *     
             */
            public Dozenten.Dozent.Adresse.Raum getRaum() {
                return raum;
            }

            /**
             * Legt den Wert der raum-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Dozenten.Dozent.Adresse.Raum }
             *     
             */
            public void setRaum(Dozenten.Dozent.Adresse.Raum value) {
                this.raum = value;
            }

            /**
             * Ruft den Wert der tel-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Dozenten.Dozent.Adresse.Tel }
             *     
             */
            public Dozenten.Dozent.Adresse.Tel getTel() {
                return tel;
            }

            /**
             * Legt den Wert der tel-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Dozenten.Dozent.Adresse.Tel }
             *     
             */
            public void setTel(Dozenten.Dozent.Adresse.Tel value) {
                this.tel = value;
            }

            /**
             * Ruft den Wert der email-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Dozenten.Dozent.Adresse.Email }
             *     
             */
            public Dozenten.Dozent.Adresse.Email getEmail() {
                return email;
            }

            /**
             * Legt den Wert der email-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Dozenten.Dozent.Adresse.Email }
             *     
             */
            public void setEmail(Dozenten.Dozent.Adresse.Email value) {
                this.email = value;
            }

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
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Email {

                @XmlAttribute(name = "adresse")
                protected String adresse;

                /**
                 * Ruft den Wert der adresse-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdresse() {
                    return adresse;
                }

                /**
                 * Legt den Wert der adresse-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdresse(String value) {
                    this.adresse = value;
                }

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
             *       &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="nummer" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Raum {

                @XmlAttribute(name = "titel")
                protected String titel;
                @XmlAttribute(name = "nummer")
                protected Integer nummer;

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
                 * Ruft den Wert der nummer-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getNummer() {
                    return nummer;
                }

                /**
                 * Legt den Wert der nummer-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setNummer(Integer value) {
                    this.nummer = value;
                }

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
             *         &lt;element name="nummer" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="nr" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "nummer"
            })
            public static class Tel {

                @XmlElement(required = true)
                protected java.util.List<Dozenten.Dozent.Adresse.Tel.Nummer> nummer;

                /**
                 * Gets the value of the nummer property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the nummer property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNummer().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Dozenten.Dozent.Adresse.Tel.Nummer }
                 * 
                 * 
                 */
                public java.util.List<Dozenten.Dozent.Adresse.Tel.Nummer> getNummer() {
                    if (nummer == null) {
                        nummer = new ArrayList<Dozenten.Dozent.Adresse.Tel.Nummer>();
                    }
                    return this.nummer;
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
                 *       &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="nr" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Nummer {

                    @XmlAttribute(name = "titel")
                    protected String titel;
                    @XmlAttribute(name = "nr")
                    protected String nr;

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
                     * Ruft den Wert der nr-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNr() {
                        return nr;
                    }

                    /**
                     * Legt den Wert der nr-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNr(String value) {
                        this.nr = value;
                    }

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
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="lehrgebiet" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="schwerpunkte" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="sprechzeit" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="veranstaltungen">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="list" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="kuerzel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "lehrgebiet",
            "schwerpunkte",
            "url",
            "sprechzeit",
            "veranstaltungen"
        })
        public static class Lehre {

            @XmlElement(required = true)
            protected Object lehrgebiet;
            @XmlElement(required = true)
            protected Object schwerpunkte;
            @XmlElement(required = true)
            protected Object url;
            @XmlElement(required = true)
            protected Object sprechzeit;
            @XmlElement(required = true)
            protected Dozenten.Dozent.Lehre.Veranstaltungen veranstaltungen;

            /**
             * Ruft den Wert der lehrgebiet-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getLehrgebiet() {
                return lehrgebiet;
            }

            /**
             * Legt den Wert der lehrgebiet-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setLehrgebiet(Object value) {
                this.lehrgebiet = value;
            }

            /**
             * Ruft den Wert der schwerpunkte-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSchwerpunkte() {
                return schwerpunkte;
            }

            /**
             * Legt den Wert der schwerpunkte-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSchwerpunkte(Object value) {
                this.schwerpunkte = value;
            }

            /**
             * Ruft den Wert der url-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getUrl() {
                return url;
            }

            /**
             * Legt den Wert der url-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setUrl(Object value) {
                this.url = value;
            }

            /**
             * Ruft den Wert der sprechzeit-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSprechzeit() {
                return sprechzeit;
            }

            /**
             * Legt den Wert der sprechzeit-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSprechzeit(Object value) {
                this.sprechzeit = value;
            }

            /**
             * Ruft den Wert der veranstaltungen-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Dozenten.Dozent.Lehre.Veranstaltungen }
             *     
             */
            public Dozenten.Dozent.Lehre.Veranstaltungen getVeranstaltungen() {
                return veranstaltungen;
            }

            /**
             * Legt den Wert der veranstaltungen-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Dozenten.Dozent.Lehre.Veranstaltungen }
             *     
             */
            public void setVeranstaltungen(Dozenten.Dozent.Lehre.Veranstaltungen value) {
                this.veranstaltungen = value;
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
             *         &lt;element name="list" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="kuerzel" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "list"
            })
            public static class Veranstaltungen {

                @XmlElement(required = true)
                protected java.util.List<Dozenten.Dozent.Lehre.Veranstaltungen.List> list;
                @XmlAttribute(name = "titel")
                protected String titel;

                /**
                 * Gets the value of the list property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the list property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getList().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Dozenten.Dozent.Lehre.Veranstaltungen.List }
                 * 
                 * 
                 */
                public java.util.List<Dozenten.Dozent.Lehre.Veranstaltungen.List> getList() {
                    if (list == null) {
                        list = new ArrayList<Dozenten.Dozent.Lehre.Veranstaltungen.List>();
                    }
                    return this.list;
                }

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
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="kuerzel" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class List {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "kuerzel")
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
         *         &lt;element name="eintrag" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="verfasser" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="modul" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="titel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "eintrag"
        })
        public static class Newsticker {

            protected java.util.List<Dozenten.Dozent.Newsticker.Eintrag> eintrag;
            @XmlAttribute(name = "titel")
            protected String titel;

            /**
             * Gets the value of the eintrag property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the eintrag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEintrag().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Dozenten.Dozent.Newsticker.Eintrag }
             * 
             * 
             */
            public java.util.List<Dozenten.Dozent.Newsticker.Eintrag> getEintrag() {
                if (eintrag == null) {
                    eintrag = new ArrayList<Dozenten.Dozent.Newsticker.Eintrag>();
                }
                return this.eintrag;
            }

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
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}date" />
             *       &lt;attribute name="verfasser" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="modul" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Eintrag {

                @XmlAttribute(name = "datum")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar datum;
                @XmlAttribute(name = "verfasser")
                protected String verfasser;
                @XmlAttribute(name = "modul")
                protected String modul;
                @XmlAttribute(name = "text")
                protected String text;

                /**
                 * Ruft den Wert der datum-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDatum() {
                    return datum;
                }

                /**
                 * Legt den Wert der datum-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDatum(XMLGregorianCalendar value) {
                    this.datum = value;
                }

                /**
                 * Ruft den Wert der verfasser-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVerfasser() {
                    return verfasser;
                }

                /**
                 * Legt den Wert der verfasser-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVerfasser(String value) {
                    this.verfasser = value;
                }

                /**
                 * Ruft den Wert der modul-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getModul() {
                    return modul;
                }

                /**
                 * Legt den Wert der modul-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setModul(String value) {
                    this.modul = value;
                }

                /**
                 * Ruft den Wert der text-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * Legt den Wert der text-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
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
         *       &lt;attribute name="kategorie" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Titel {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "kategorie")
            protected String kategorie;

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
             * Ruft den Wert der kategorie-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKategorie() {
                return kategorie;
            }

            /**
             * Legt den Wert der kategorie-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKategorie(String value) {
                this.kategorie = value;
            }

        }

    }

}
