package soast.client;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import soast.client.service.Person;

/**
 *
 * @author VakSF
 */
public class SOASTController implements Initializable {
    
    @FXML
    private JFXTextField nameTF, rfcTF, addressTF, 
            nacionalityTF, emailTF, cellphoneTF;
    
    @FXML
    private DatePicker birthdayDP;
    
    @FXML
    private ListView<Person> personsLV;
    private final ObservableList<Person> personsList = FXCollections.observableArrayList();
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.personsList.addAll(this.listPersons());
        this.personsLV.setItems(this.personsList);
    }
    
    @FXML
    private void createPerson() throws DatatypeConfigurationException {
        
        String name = this.nameTF.getText();
        XMLGregorianCalendar birthday = this.getGCfromDate(this.birthdayDP.getValue());
        String rfc = this.rfcTF.getText();
        String address = this.addressTF.getText();
        String nacionality = this.nacionalityTF.getText();
        String email = this.emailTF.getText();
        String cellphone = this.cellphoneTF.getText();
        
        Long idPerson = createPerson(
                name, rfc, address, nacionality, birthday, email, cellphone
        );
        
        new Alert(
                AlertType.INFORMATION, 
                "Se ha creado exitosamente una nueva persona! ID = " + idPerson
        ).showAndWait();
        
    }
    
    private XMLGregorianCalendar getGCfromDate(LocalDate date) 
            throws DatatypeConfigurationException {
        
        GregorianCalendar gcal = GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));
        
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
    }

    private static Long createPerson(java.lang.String name, java.lang.String rfc, java.lang.String address, java.lang.String nacionality, javax.xml.datatype.XMLGregorianCalendar birthday, java.lang.String email, java.lang.String cellphone) {
        soast.client.service.PersonWS_Service service = new soast.client.service.PersonWS_Service();
        soast.client.service.PersonWS port = service.getPersonWSPort();
        return port.createPerson(name, rfc, address, nacionality, birthday, email, cellphone);
    }

    private static boolean deletePerson(java.lang.Long personId) {
        soast.client.service.PersonWS_Service service = new soast.client.service.PersonWS_Service();
        soast.client.service.PersonWS port = service.getPersonWSPort();
        return port.deletePerson(personId);
    }

    private static java.util.List<soast.client.service.Person> listPersons() {
        soast.client.service.PersonWS_Service service = new soast.client.service.PersonWS_Service();
        soast.client.service.PersonWS port = service.getPersonWSPort();
        return port.listPersons();
    }

}
