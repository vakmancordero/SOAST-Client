
package soast.client.service.curso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para allCursoTypev2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="allCursoTypev2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreCurso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCurso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreCapacitador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idPrograma" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="disponibilidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCatalagoCurso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="objetivos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idProyecto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allCursoTypev2", propOrder = {
    "nombreCurso",
    "idCurso",
    "nombreCapacitador",
    "idPrograma",
    "fechaRegistro",
    "fechaInicio",
    "disponibilidad",
    "descripcion",
    "idCatalagoCurso",
    "objetivos",
    "idProyecto"
})
public class AllCursoTypev2 {

    @XmlElement(required = true)
    protected String nombreCurso;
    protected int idCurso;
    @XmlElement(required = true)
    protected String nombreCapacitador;
    protected int idPrograma;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInicio;
    protected int disponibilidad;
    @XmlElement(required = true)
    protected String descripcion;
    protected int idCatalagoCurso;
    @XmlElement(required = true)
    protected String objetivos;
    protected int idProyecto;

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
     * Obtiene el valor de la propiedad idCurso.
     * 
     */
    public int getIdCurso() {
        return idCurso;
    }

    /**
     * Define el valor de la propiedad idCurso.
     * 
     */
    public void setIdCurso(int value) {
        this.idCurso = value;
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
     * Obtiene el valor de la propiedad idPrograma.
     * 
     */
    public int getIdPrograma() {
        return idPrograma;
    }

    /**
     * Define el valor de la propiedad idPrograma.
     * 
     */
    public void setIdPrograma(int value) {
        this.idPrograma = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegistro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Define el valor de la propiedad fechaRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRegistro(XMLGregorianCalendar value) {
        this.fechaRegistro = value;
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
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idCatalagoCurso.
     * 
     */
    public int getIdCatalagoCurso() {
        return idCatalagoCurso;
    }

    /**
     * Define el valor de la propiedad idCatalagoCurso.
     * 
     */
    public void setIdCatalagoCurso(int value) {
        this.idCatalagoCurso = value;
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
     * Obtiene el valor de la propiedad idProyecto.
     * 
     */
    public int getIdProyecto() {
        return idProyecto;
    }

    /**
     * Define el valor de la propiedad idProyecto.
     * 
     */
    public void setIdProyecto(int value) {
        this.idProyecto = value;
    }

}
