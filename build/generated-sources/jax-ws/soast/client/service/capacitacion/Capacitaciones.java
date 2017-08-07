
package soast.client.service.capacitacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Capacitaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Capacitaciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objetivos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requisitos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaPublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capacitaciones", propOrder = {
    "folio",
    "nombre",
    "tipo",
    "objetivos",
    "requisitos",
    "fechaPublicacion"
})
public class Capacitaciones {

    @XmlElement(required = true)
    protected String folio;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(required = true)
    protected String objetivos;
    @XmlElement(required = true)
    protected String requisitos;
    @XmlElement(required = true)
    protected String fechaPublicacion;

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad objetivos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjetivos() {
        return objetivos;
    }

    /**
     * Define el valor de la propiedad objetivos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjetivos(String value) {
        this.objetivos = value;
    }

    /**
     * Obtiene el valor de la propiedad requisitos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequisitos() {
        return requisitos;
    }

    /**
     * Define el valor de la propiedad requisitos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequisitos(String value) {
        this.requisitos = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPublicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Define el valor de la propiedad fechaPublicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPublicacion(String value) {
        this.fechaPublicacion = value;
    }

}
