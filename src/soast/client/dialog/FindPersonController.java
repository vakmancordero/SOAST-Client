package soast.client.dialog;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TableView;
import soast.client.sevice.person.Person;

/**
 *
 * @author VakSF
 */
public class FindPersonController implements Initializable {
    
    @FXML
    private TableView<Person> personsTV;
    
    private Person person;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    private void finish(ActionEvent event) {
        
        this.person = this.personsTV.getSelectionModel().getSelectedItem();
        
        ((Node) event.getSource()).getScene().getWindow().hide();
    }
    
    public Person getPerson() {
        return this.person;
    }
    
    public void initData(ObservableList<Person> personsList) {
        this.personsTV.setItems(personsList);
    }
    
}
