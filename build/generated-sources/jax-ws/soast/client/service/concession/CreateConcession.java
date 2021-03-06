
package soast.client.service.concession;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para createConcession complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createConcession">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="town" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="concessionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expeditionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expeditionPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licensePlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createConcession", propOrder = {
    "idPerson",
    "town",
    "concessionType",
    "expeditionDate",
    "expirationDate",
    "expeditionPlace",
    "unitType",
    "licensePlate"
})
public class CreateConcession {

    protected Long idPerson;
    protected String town;
    protected String concessionType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expeditionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected String expeditionPlace;
    protected String unitType;
    protected String licensePlate;

    /**
     * Obtiene el valor de la propiedad idPerson.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPerson() {
        return idPerson;
    }

    /**
     * Define el valor de la propiedad idPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPerson(Long value) {
        this.idPerson = value;
    }

    /**
     * Obtiene el valor de la propiedad town.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Define el valor de la propiedad town.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Obtiene el valor de la propiedad concessionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcessionType() {
        return concessionType;
    }

    /**
     * Define el valor de la propiedad concessionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcessionType(String value) {
        this.concessionType = value;
    }

    /**
     * Obtiene el valor de la propiedad expeditionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpeditionDate() {
        return expeditionDate;
    }

    /**
     * Define el valor de la propiedad expeditionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpeditionDate(XMLGregorianCalendar value) {
        this.expeditionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define el valor de la propiedad expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expeditionPlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeditionPlace() {
        return expeditionPlace;
    }

    /**
     * Define el valor de la propiedad expeditionPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeditionPlace(String value) {
        this.expeditionPlace = value;
    }

    /**
     * Obtiene el valor de la propiedad unitType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * Define el valor de la propiedad unitType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
    }

    /**
     * Obtiene el valor de la propiedad licensePlate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Define el valor de la propiedad licensePlate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensePlate(String value) {
        this.licensePlate = value;
    }

}
