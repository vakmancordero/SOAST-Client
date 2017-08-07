
package soast.client.service.curso;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soast.client.service.curso package. 
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

    private final static QName _MensajeEliminar_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "mensajeEliminar");
    private final static QName _AllMensajeEntrada_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "allMensajeEntrada");
    private final static QName _IdCursoEliminar_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "idCursoEliminar");
    private final static QName _NombreCursoConsulta_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "nombreCursoConsulta");
    private final static QName _MensajeEditar_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "mensajeEditar");
    private final static QName _AllTallerTypeFechaInicio_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "fechaInicio");
    private final static QName _AllTallerTypeIdCatalagoTaller_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "idCatalagoTaller");
    private final static QName _AllTallerTypeObjetivos_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "objetivos");
    private final static QName _AllTallerTypeNombreTaller_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "nombreTaller");
    private final static QName _AllTallerTypeIdPrograma_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "idPrograma");
    private final static QName _AllTallerTypeIdProyecto_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "idProyecto");
    private final static QName _AllTallerTypeDescripcion_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "descripcion");
    private final static QName _AllTallerTypeDisponibilidad_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "disponibilidad");
    private final static QName _AllTallerTypeIdTaller_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "idTaller");
    private final static QName _AllTallerTypeFechRegistro_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "fechRegistro");
    private final static QName _AllTallerTypeNombreCapacitador_QNAME = new QName("http://xml.netbeans.org/schema/EsquemaTallerXml", "nombreCapacitador");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soast.client.service.curso
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CursoG }
     * 
     */
    public CursoG createCursoG() {
        return new CursoG();
    }

    /**
     * Create an instance of {@link CursoTypeG }
     * 
     */
    public CursoTypeG createCursoTypeG() {
        return new CursoTypeG();
    }

    /**
     * Create an instance of {@link EditarCurso }
     * 
     */
    public EditarCurso createEditarCurso() {
        return new EditarCurso();
    }

    /**
     * Create an instance of {@link EditarTypeCurso }
     * 
     */
    public EditarTypeCurso createEditarTypeCurso() {
        return new EditarTypeCurso();
    }

    /**
     * Create an instance of {@link CursoConsultaReturn }
     * 
     */
    public CursoConsultaReturn createCursoConsultaReturn() {
        return new CursoConsultaReturn();
    }

    /**
     * Create an instance of {@link CursoTypeBuscaReturn }
     * 
     */
    public CursoTypeBuscaReturn createCursoTypeBuscaReturn() {
        return new CursoTypeBuscaReturn();
    }

    /**
     * Create an instance of {@link CursoExitoG }
     * 
     */
    public CursoExitoG createCursoExitoG() {
        return new CursoExitoG();
    }

    /**
     * Create an instance of {@link CursoTypeGexito }
     * 
     */
    public CursoTypeGexito createCursoTypeGexito() {
        return new CursoTypeGexito();
    }

    /**
     * Create an instance of {@link AllCurso }
     * 
     */
    public AllCurso createAllCurso() {
        return new AllCurso();
    }

    /**
     * Create an instance of {@link AllCursoTypev2 }
     * 
     */
    public AllCursoTypev2 createAllCursoTypev2() {
        return new AllCursoTypev2();
    }

    /**
     * Create an instance of {@link AllTallerType }
     * 
     */
    public AllTallerType createAllTallerType() {
        return new AllTallerType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "mensajeEliminar")
    public JAXBElement<String> createMensajeEliminar(String value) {
        return new JAXBElement<String>(_MensajeEliminar_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "allMensajeEntrada")
    public JAXBElement<String> createAllMensajeEntrada(String value) {
        return new JAXBElement<String>(_AllMensajeEntrada_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "idCursoEliminar")
    public JAXBElement<Integer> createIdCursoEliminar(Integer value) {
        return new JAXBElement<Integer>(_IdCursoEliminar_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "nombreCursoConsulta")
    public JAXBElement<String> createNombreCursoConsulta(String value) {
        return new JAXBElement<String>(_NombreCursoConsulta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "mensajeEditar")
    public JAXBElement<String> createMensajeEditar(String value) {
        return new JAXBElement<String>(_MensajeEditar_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "fechaInicio", scope = AllTallerType.class)
    public JAXBElement<XMLGregorianCalendar> createAllTallerTypeFechaInicio(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AllTallerTypeFechaInicio_QNAME, XMLGregorianCalendar.class, AllTallerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "idCatalagoTaller", scope = AllTallerType.class)
    public JAXBElement<Integer> createAllTallerTypeIdCatalagoTaller(Integer value) {
        return new JAXBElement<Integer>(_AllTallerTypeIdCatalagoTaller_QNAME, Integer.class, AllTallerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "objetivos", scope = AllTallerType.class)
    public JAXBElement<String> createAllTallerTypeObjetivos(String value) {
        return new JAXBElement<String>(_AllTallerTypeObjetivos_QNAME, String.class, AllTallerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "nombreTaller", scope = AllTallerType.class)
    public JAXBElement<String> createAllTallerTypeNombreTaller(String value) {
        return new JAXBElement<String>(_AllTallerTypeNombreTaller_QNAME, String.class, AllTallerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "idPrograma", scope = AllTallerType.class)
    public JAXBElement<Integer> createAllTallerTypeIdPrograma(Integer value) {
        return new JAXBElement<Integer>(_AllTallerTypeIdPrograma_QNAME, Integer.class, AllTallerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "idProyecto", scope = AllTallerType.class)
    public JAXBElement<Integer> createAllTallerTypeIdProyecto(Integer value) {
        return new JAXBElement<Integer>(_AllTallerTypeIdProyecto_QNAME, Integer.class, AllTallerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "descripcion", scope = AllTallerType.class)
    public JAXBElement<String> createAllTallerTypeDescripcion(String value) {
        return new JAXBElement<String>(_AllTallerTypeDescripcion_QNAME, String.class, AllTallerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "disponibilidad", scope = AllTallerType.class)
    public JAXBElement<Integer> createAllTallerTypeDisponibilidad(Integer value) {
        return new JAXBElement<Integer>(_AllTallerTypeDisponibilidad_QNAME, Integer.class, AllTallerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "idTaller", scope = AllTallerType.class)
    public JAXBElement<Integer> createAllTallerTypeIdTaller(Integer value) {
        return new JAXBElement<Integer>(_AllTallerTypeIdTaller_QNAME, Integer.class, AllTallerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "fechRegistro", scope = AllTallerType.class)
    public JAXBElement<XMLGregorianCalendar> createAllTallerTypeFechRegistro(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AllTallerTypeFechRegistro_QNAME, XMLGregorianCalendar.class, AllTallerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/EsquemaTallerXml", name = "nombreCapacitador", scope = AllTallerType.class)
    public JAXBElement<String> createAllTallerTypeNombreCapacitador(String value) {
        return new JAXBElement<String>(_AllTallerTypeNombreCapacitador_QNAME, String.class, AllTallerType.class, value);
    }

}
