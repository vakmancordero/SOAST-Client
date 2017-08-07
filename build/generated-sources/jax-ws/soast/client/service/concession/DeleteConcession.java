
package soast.client.service.concession;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para deleteConcession complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deleteConcession">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idConcession" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteConcession", propOrder = {
    "idConcession"
})
public class DeleteConcession {

    protected Long idConcession;

    /**
     * Obtiene el valor de la propiedad idConcession.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdConcession() {
        return idConcession;
    }

    /**
     * Define el valor de la propiedad idConcession.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdConcession(Long value) {
        this.idConcession = value;
    }

}
