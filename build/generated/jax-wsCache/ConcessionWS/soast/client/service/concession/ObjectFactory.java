
package soast.client.service.concession;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soast.client.service.concession package. 
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

    private final static QName _ListConcessionResponse_QNAME = new QName("http://webservice.soast.candlelabs.com/", "listConcessionResponse");
    private final static QName _DeleteConcession_QNAME = new QName("http://webservice.soast.candlelabs.com/", "deleteConcession");
    private final static QName _DeleteConcessionResponse_QNAME = new QName("http://webservice.soast.candlelabs.com/", "deleteConcessionResponse");
    private final static QName _CreateConcession_QNAME = new QName("http://webservice.soast.candlelabs.com/", "createConcession");
    private final static QName _ListConcession_QNAME = new QName("http://webservice.soast.candlelabs.com/", "listConcession");
    private final static QName _CreateConcessionResponse_QNAME = new QName("http://webservice.soast.candlelabs.com/", "createConcessionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soast.client.service.concession
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateConcession }
     * 
     */
    public CreateConcession createCreateConcession() {
        return new CreateConcession();
    }

    /**
     * Create an instance of {@link DeleteConcessionResponse }
     * 
     */
    public DeleteConcessionResponse createDeleteConcessionResponse() {
        return new DeleteConcessionResponse();
    }

    /**
     * Create an instance of {@link DeleteConcession }
     * 
     */
    public DeleteConcession createDeleteConcession() {
        return new DeleteConcession();
    }

    /**
     * Create an instance of {@link ListConcessionResponse }
     * 
     */
    public ListConcessionResponse createListConcessionResponse() {
        return new ListConcessionResponse();
    }

    /**
     * Create an instance of {@link CreateConcessionResponse }
     * 
     */
    public CreateConcessionResponse createCreateConcessionResponse() {
        return new CreateConcessionResponse();
    }

    /**
     * Create an instance of {@link ListConcession }
     * 
     */
    public ListConcession createListConcession() {
        return new ListConcession();
    }

    /**
     * Create an instance of {@link Concession }
     * 
     */
    public Concession createConcession() {
        return new Concession();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListConcessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soast.candlelabs.com/", name = "listConcessionResponse")
    public JAXBElement<ListConcessionResponse> createListConcessionResponse(ListConcessionResponse value) {
        return new JAXBElement<ListConcessionResponse>(_ListConcessionResponse_QNAME, ListConcessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteConcession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soast.candlelabs.com/", name = "deleteConcession")
    public JAXBElement<DeleteConcession> createDeleteConcession(DeleteConcession value) {
        return new JAXBElement<DeleteConcession>(_DeleteConcession_QNAME, DeleteConcession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteConcessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soast.candlelabs.com/", name = "deleteConcessionResponse")
    public JAXBElement<DeleteConcessionResponse> createDeleteConcessionResponse(DeleteConcessionResponse value) {
        return new JAXBElement<DeleteConcessionResponse>(_DeleteConcessionResponse_QNAME, DeleteConcessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateConcession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soast.candlelabs.com/", name = "createConcession")
    public JAXBElement<CreateConcession> createCreateConcession(CreateConcession value) {
        return new JAXBElement<CreateConcession>(_CreateConcession_QNAME, CreateConcession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListConcession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soast.candlelabs.com/", name = "listConcession")
    public JAXBElement<ListConcession> createListConcession(ListConcession value) {
        return new JAXBElement<ListConcession>(_ListConcession_QNAME, ListConcession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateConcessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soast.candlelabs.com/", name = "createConcessionResponse")
    public JAXBElement<CreateConcessionResponse> createCreateConcessionResponse(CreateConcessionResponse value) {
        return new JAXBElement<CreateConcessionResponse>(_CreateConcessionResponse_QNAME, CreateConcessionResponse.class, null, value);
    }

}
