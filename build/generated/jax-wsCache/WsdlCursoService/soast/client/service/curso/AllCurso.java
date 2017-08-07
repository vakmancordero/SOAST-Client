
package soast.client.service.curso;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allCurso" type="{http://xml.netbeans.org/schema/EsquemaTallerXml}allCursoTypev2" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allCurso"
})
@XmlRootElement(name = "allCurso")
public class AllCurso {

    @XmlElement(required = true)
    protected List<AllCursoTypev2> allCurso;

    /**
     * Gets the value of the allCurso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allCurso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllCurso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllCursoTypev2 }
     * 
     * 
     */
    public List<AllCursoTypev2> getAllCurso() {
        if (allCurso == null) {
            allCurso = new ArrayList<AllCursoTypev2>();
        }
        return this.allCurso;
    }

}
