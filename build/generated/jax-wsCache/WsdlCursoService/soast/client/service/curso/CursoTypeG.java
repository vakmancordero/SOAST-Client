
package soast.client.service.curso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para CursoTypeG complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CursoTypeG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPrograma" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="disponibilidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idCatalogoCurso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idCapacitador" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CursoTypeG", propOrder = {
    "idPrograma",
    "fechaInicio",
    "disponibilidad",
    "idCatalogoCurso",
    "idCapacitador"
})
public class CursoTypeG {

    protected int idPrograma;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInicio;
    protected int disponibilidad;
    protected int idCatalogoCurso;
    protected int idCapacitador;

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
     * Obtiene el valor de la propiedad idCatalogoCurso.
     * 
     */
    public int getIdCatalogoCurso() {
        return idCatalogoCurso;
    }

    /**
     * Define el valor de la propiedad idCatalogoCurso.
     * 
     */
    public void setIdCatalogoCurso(int value) {
        this.idCatalogoCurso = value;
    }

    /**
     * Obtiene el valor de la propiedad idCapacitador.
     * 
     */
    public int getIdCapacitador() {
        return idCapacitador;
    }

    /**
     * Define el valor de la propiedad idCapacitador.
     * 
     */
    public void setIdCapacitador(int value) {
        this.idCapacitador = value;
    }

}
