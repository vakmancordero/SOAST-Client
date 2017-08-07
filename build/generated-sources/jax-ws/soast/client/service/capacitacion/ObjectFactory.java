
package soast.client.service.capacitacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soast.client.service.capacitacion package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CapacitacionesNombre_QNAME = new QName("http://xml.netbeans.org/schema/CapacitacionSchema", "capacitacionesNombre");
    private final static QName _Tipo_QNAME = new QName("http://xml.netbeans.org/schema/CapacitacionSchema", "tipo");
    private final static QName _Nombre_QNAME = new QName("http://xml.netbeans.org/schema/CapacitacionSchema", "nombre");
    private final static QName _CapacitacionesType_QNAME = new QName("http://xml.netbeans.org/schema/CapacitacionSchema", "capacitacionesType");
    private final static QName _SolicitudType_QNAME = new QName("http://xml.netbeans.org/schema/CapacitacionSchema", "solicitudType");
    private final static QName _Mensaje_QNAME = new QName("http://xml.netbeans.org/schema/CapacitacionSchema", "mensaje");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soast.client.service.capacitacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CapacitacionNom }
     * 
     */
    public CapacitacionNom createCapacitacionNom() {
        return new CapacitacionNom();
    }

    /**
     * Create an instance of {@link Capacitacion }
     * 
     */
    public Capacitacion createCapacitacion() {
        return new Capacitacion();
    }

    /**
     * Create an instance of {@link SolicitudCapacitacion }
     * 
     */
    public SolicitudCapacitacion createSolicitudCapacitacion() {
        return new SolicitudCapacitacion();
    }

    /**
     * Create an instance of {@link Capacitaciones }
     * 
     */
    public Capacitaciones createCapacitaciones() {
        return new Capacitaciones();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapacitacionNom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/CapacitacionSchema", name = "capacitacionesNombre")
    public JAXBElement<CapacitacionNom> createCapacitacionesNombre(CapacitacionNom value) {
        return new JAXBElement<CapacitacionNom>(_CapacitacionesNombre_QNAME, CapacitacionNom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/CapacitacionSchema", name = "tipo")
    public JAXBElement<String> createTipo(String value) {
        return new JAXBElement<String>(_Tipo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/CapacitacionSchema", name = "nombre")
    public JAXBElement<String> createNombre(String value) {
        return new JAXBElement<String>(_Nombre_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capacitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/CapacitacionSchema", name = "capacitacionesType")
    public JAXBElement<Capacitacion> createCapacitacionesType(Capacitacion value) {
        return new JAXBElement<Capacitacion>(_CapacitacionesType_QNAME, Capacitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitudCapacitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/CapacitacionSchema", name = "solicitudType")
    public JAXBElement<SolicitudCapacitacion> createSolicitudType(SolicitudCapacitacion value) {
        return new JAXBElement<SolicitudCapacitacion>(_SolicitudType_QNAME, SolicitudCapacitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/CapacitacionSchema", name = "mensaje")
    public JAXBElement<String> createMensaje(String value) {
        return new JAXBElement<String>(_Mensaje_QNAME, String.class, null, value);
    }

}
