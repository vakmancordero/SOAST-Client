
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
 *         &lt;element name="CursoGr" type="{http://xml.netbeans.org/schema/EsquemaTallerXml}CursoTypeG"/>
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
    "cursoGr"
})
@XmlRootElement(name = "CursoG")
public class CursoG {

    @XmlElement(name = "CursoGr", required = true)
    protected CursoTypeG cursoGr;

    /**
     * Obtiene el valor de la propiedad cursoGr.
     * 
     * @return
     *     possible object is
     *     {@link CursoTypeG }
     *     
     */
    public CursoTypeG getCursoGr() {
        return cursoGr;
    }

    /**
     * Define el valor de la propiedad cursoGr.
     * 
     * @param value
     *     allowed object is
     *     {@link CursoTypeG }
     *     
     */
    public void setCursoGr(CursoTypeG value) {
        this.cursoGr = value;
    }

}
