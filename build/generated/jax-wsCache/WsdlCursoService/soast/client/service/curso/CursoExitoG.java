
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
 *         &lt;element name="CursoExitoGr" type="{http://xml.netbeans.org/schema/EsquemaTallerXml}CursoTypeGexito"/>
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
    "cursoExitoGr"
})
@XmlRootElement(name = "CursoExitoG")
public class CursoExitoG {

    @XmlElement(name = "CursoExitoGr", required = true)
    protected CursoTypeGexito cursoExitoGr;

    /**
     * Obtiene el valor de la propiedad cursoExitoGr.
     * 
     * @return
     *     possible object is
     *     {@link CursoTypeGexito }
     *     
     */
    public CursoTypeGexito getCursoExitoGr() {
        return cursoExitoGr;
    }

    /**
     * Define el valor de la propiedad cursoExitoGr.
     * 
     * @param value
     *     allowed object is
     *     {@link CursoTypeGexito }
     *     
     */
    public void setCursoExitoGr(CursoTypeGexito value) {
        this.cursoExitoGr = value;
    }

}
