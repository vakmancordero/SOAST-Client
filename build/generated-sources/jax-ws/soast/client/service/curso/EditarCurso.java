
package soast.client.service.curso;

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
 *         &lt;element name="editarCursoR" type="{http://xml.netbeans.org/schema/EsquemaTallerXml}editarTypeCurso"/>
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
    "editarCursoR"
})
@XmlRootElement(name = "editarCurso")
public class EditarCurso {

    @XmlElement(required = true)
    protected EditarTypeCurso editarCursoR;

    /**
     * Obtiene el valor de la propiedad editarCursoR.
     * 
     * @return
     *     possible object is
     *     {@link EditarTypeCurso }
     *     
     */
    public EditarTypeCurso getEditarCursoR() {
        return editarCursoR;
    }

    /**
     * Define el valor de la propiedad editarCursoR.
     * 
     * @param value
     *     allowed object is
     *     {@link EditarTypeCurso }
     *     
     */
    public void setEditarCursoR(EditarTypeCurso value) {
        this.editarCursoR = value;
    }

}
