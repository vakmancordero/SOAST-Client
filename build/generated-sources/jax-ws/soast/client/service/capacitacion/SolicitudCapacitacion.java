
package soast.client.service.capacitacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para solicitudCapacitacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="solicitudCapacitacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="folioCapacitacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudCapacitacion", propOrder = {
    "usuario",
    "folioCapacitacion"
})
public class SolicitudCapacitacion {

    @XmlElement(required = true)
    protected String usuario;
    @XmlElement(required = true)
    protected String folioCapacitacion;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad folioCapacitacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioCapacitacion() {
        return folioCapacitacion;
    }

    /**
     * Define el valor de la propiedad folioCapacitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioCapacitacion(String value) {
        this.folioCapacitacion = value;
    }

}
