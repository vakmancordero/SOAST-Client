
package soast.client.service.curso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para CursoTypeBuscaReturn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CursoTypeBuscaReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreCurso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="disponibilidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombrePrograma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreCapacitador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CursoTypeBuscaReturn", propOrder = {
    "nombreCurso",
    "fechaInicio",
    "disponibilidad",
    "nombrePrograma",
    "nombreCapacitador",
    "fechaCreacion"
})
public class CursoTypeBuscaReturn {

    @XmlElement(required = true)
    protected String nombreCurso;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInicio;
    protected int disponibilidad;
    @XmlElement(required = true)
    protected String nombrePrograma;
    @XmlElement(required = true)
    protected String nombreCapacitador;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaCreacion;

    /**
     * Obtiene el valor de la propiedad nombreCurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     * Define el valor de la propiedad nombreCurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCurso(String value) {
        this.nombreCurso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicio(XMLGregorianCalendar value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad disponibilidad.
     * 
     */
    public int getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Define el valor de la propiedad disponibilidad.
     * 
     */
    public void setDisponibilidad(int value) {
        this.disponibilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePrograma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePrograma() {
        return nombrePrograma;
    }

    /**
     * Define el valor de la propiedad nombrePrograma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePrograma(String value) {
        this.nombrePrograma = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCapacitador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCapacitador() {
        return nombreCapacitador;
    }

    /**
     * Define el valor de la propiedad nombreCapacitador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCapacitador(String value) {
        this.nombreCapacitador = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacion(XMLGregorianCalendar value) {
        this.fechaCreacion = value;
    }

}
