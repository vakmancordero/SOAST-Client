
package soast.client.service.curso;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para allTallerType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="allTallerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreTaller" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idTaller" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreCapacitador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idPrograma" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechRegistro" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="disponibilidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCatalagoTaller" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="objetivos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idPrograma" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "allTallerType", propOrder = {
    "content"
})
public class AllTallerType {

    @XmlElementRefs({
        @XmlElementRef(name = "nombreCapacitador", namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "idPrograma", namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "idCatalagoTaller", namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "objetivos", namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechRegistro", namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "idTaller", namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nombreTaller", namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "idProyecto", namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fechaInicio", namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "descripcion", namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "disponibilidad", namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "IdPrograma" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 94 de file:/C:/Users/VakSF/Desktop/SOAST-Client/xml-resources/web-service-references/WsdlCursoService/wsdl/aimos-studio.com.mx_8080/Servicios/WsdlCursoService.xsd_1.xsd
     * línea 87 de file:/C:/Users/VakSF/Desktop/SOAST-Client/xml-resources/web-service-references/WsdlCursoService/wsdl/aimos-studio.com.mx_8080/Servicios/WsdlCursoService.xsd_1.xsd
     * <p>
     * Para deshacerse de esta propiedad, aplique una personalización de propiedad a una
     * de las dos declaraciones siguientes para cambiarles de nombre: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
