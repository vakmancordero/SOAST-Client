
package soast.client.service.capacitacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para capacitacionNom complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="capacitacionNom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="listaNombre" type="{http://xml.netbeans.org/schema/CapacitacionSchema}Capacitaciones"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capacitacionNom", propOrder = {
    "listaNombre"
})
public class CapacitacionNom {

    @XmlElement(required = true)
    protected List<Capacitaciones> listaNombre;

    /**
     * Gets the value of the listaNombre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaNombre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaNombre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Capacitaciones }
     * 
     * 
     */
    public List<Capacitaciones> getListaNombre() {
        if (listaNombre == null) {
            listaNombre = new ArrayList<Capacitaciones>();
        }
        return this.listaNombre;
    }

}
