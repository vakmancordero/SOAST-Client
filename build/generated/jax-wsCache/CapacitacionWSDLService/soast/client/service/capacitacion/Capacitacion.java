
package soast.client.service.capacitacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para capacitacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="capacitacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="listaCapacitaciones" type="{http://xml.netbeans.org/schema/CapacitacionSchema}Capacitaciones"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capacitacion", propOrder = {
    "listaCapacitaciones"
})
public class Capacitacion {

    @XmlElement(required = true)
    protected List<Capacitaciones> listaCapacitaciones;

    /**
     * Gets the value of the listaCapacitaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCapacitaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCapacitaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Capacitaciones }
     * 
     * 
     */
    public List<Capacitaciones> getListaCapacitaciones() {
        if (listaCapacitaciones == null) {
            listaCapacitaciones = new ArrayList<Capacitaciones>();
        }
        return this.listaCapacitaciones;
    }

}
