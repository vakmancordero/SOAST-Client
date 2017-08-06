
package soast.client.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soast.client.service package. 
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

    private final static QName _DeletePersonResponse_QNAME = new QName("http://webservice.soast.candlelabs.com/", "deletePersonResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://webservice.soast.candlelabs.com/", "deletePerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://webservice.soast.candlelabs.com/", "createPersonResponse");
    private final static QName _ListPersonsResponse_QNAME = new QName("http://webservice.soast.candlelabs.com/", "listPersonsResponse");
    private final static QName _CreatePerson_QNAME = new QName("http://webservice.soast.candlelabs.com/", "createPerson");
    private final static QName _ListPersons_QNAME = new QName("http://webservice.soast.candlelabs.com/", "listPersons");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soast.client.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link ListPersons }
     * 
     */
    public ListPersons createListPersons() {
        return new ListPersons();
    }

    /**
     * Create an instance of {@link ListPersonsResponse }
     * 
     */
    public ListPersonsResponse createListPersonsResponse() {
        return new ListPersonsResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soast.candlelabs.com/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soast.candlelabs.com/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soast.candlelabs.com/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soast.candlelabs.com/", name = "listPersonsResponse")
    public JAXBElement<ListPersonsResponse> createListPersonsResponse(ListPersonsResponse value) {
        return new JAXBElement<ListPersonsResponse>(_ListPersonsResponse_QNAME, ListPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soast.candlelabs.com/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soast.candlelabs.com/", name = "listPersons")
    public JAXBElement<ListPersons> createListPersons(ListPersons value) {
        return new JAXBElement<ListPersons>(_ListPersons_QNAME, ListPersons.class, null, value);
    }

}
