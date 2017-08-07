
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
 *         &lt;element name="CursoReturn" type="{http://xml.netbeans.org/schema/EsquemaTallerXml}CursoTypeBuscaReturn"/>
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
    "cursoReturn"
})
@XmlRootElement(name = "CursoConsultaReturn")
public class CursoConsultaReturn {

    @XmlElement(name = "CursoReturn", required = true)
    protected CursoTypeBuscaReturn cursoReturn;

    /**
     * Obtiene el valor de la propiedad cursoReturn.
     * 
     * @return
     *     possible object is
     *     {@link CursoTypeBuscaReturn }
     *     
     */
    public CursoTypeBuscaReturn getCursoReturn() {
        return cursoReturn;
    }

    /**
     * Define el valor de la propiedad cursoReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link CursoTypeBuscaReturn }
     *     
     */
    public void setCursoReturn(CursoTypeBuscaReturn value) {
        this.cursoReturn = value;
    }

}
