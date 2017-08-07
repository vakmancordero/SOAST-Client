package soast.client;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableCell;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import javafx.util.Callback;
import soast.client.dialog.FindPersonController;
import soast.client.service.capacitacion.Capacitacion;
import soast.client.service.capacitacion.Capacitaciones;
import soast.client.service.concession.Concession;
import soast.client.service.curso.AllCurso;
import soast.client.service.curso.AllCursoTypev2;
import soast.client.sevice.person.Person;

/**
 *
 * @author VakSF
 */
public class SOASTController implements Initializable {
    
    /* Concessionaire */
    
    @FXML
    private JFXTextField nameTF, rfcTF, addressTF, 
            nacionalityTF, emailTF, cellphoneTF;
    
    @FXML
    private DatePicker birthdayDP;
    
    @FXML
    private TableView<Person> personsTV;
    
    @FXML
    private TableColumn<Person, String> deleteColumn;
    
    private final ObservableList<Person> personsList = FXCollections.observableArrayList();
    
    private Person currentPerson;
    
    /* Concession */
    
    @FXML
    private JFXTextField nameConcessionaireTF, townTF, expeditionTF, licensePlateTF;
    
    @FXML
    private JFXComboBox<String> concessionTypeCB, unitTypeCB;
    
    @FXML
    private DatePicker expirationDP;
    
    @FXML
    private TableView<Concession> concessionsTV;
    private final ObservableList<Concession> concessionsList = FXCollections.observableArrayList();
    
    /*  Capacitaciones  */
    
    @FXML
    private TableView<Capacitaciones> capacitacionesTV;
    
    private final ObservableList<Capacitaciones> capacitacionesList = FXCollections.observableArrayList();
    
    @FXML 
    private JFXComboBox<String> capacitacionCB;
    
    @FXML
    private JFXTextArea objetivosTA;
   
    /*  Cursos  */
    
    @FXML
    private TableView<AllCursoTypev2> cursosTV;
    
    private final ObservableList<AllCursoTypev2> cursosList = FXCollections.observableArrayList();
       
    @FXML
    private JFXTextArea objetivosCursoTA, descripcionCursoTA ;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        this.personsList.addAll(SOASTController.listPersons());
        this.personsTV.setItems(this.personsList);
        
        this.concessionsList.addAll(SOASTController.listConcession());
        this.concessionsTV.setItems(this.concessionsList);
        
        this.capacitacionesTV.setItems(this.capacitacionesList);
        List<AllCursoTypev2> allCurso = SOASTController.allCurso(null).getAllCurso();
        System.out.println(allCurso.size());
        this.cursosList.addAll(allCurso);
        this.cursosTV.setItems(this.cursosList);

        this.initColumns();
        this.initConcessionSection();
        
        this.initCapacitacionSection();
        this.initCursosSection();

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
        
        Long personId = createPerson(
                name, rfc, address, nacionality, birthday, email, cellphone);
        
        Person person = new Person();
        person.setId(personId);
        person.setName(name);
        person.setRfc(rfc);
        person.setAddress(address);
        person.setNacionality(nacionality);
        person.setEmail(email);
        person.setCellphone(cellphone);
        
        if (personId != null) {
            
            this.personsList.add(person);
            
            new Alert(AlertType.INFORMATION,
                    "Se ha creado exitosamente una nueva persona! ID = " + personId + ".\n" +
                    sendNotification(
                            personId, "Secretaría de Transportes",
                            "Usted ha sido dado de alta satisfactoriamente a la SCT"
                    )
            ).show();
            
        } else {
            
            new Alert(AlertType.INFORMATION,
                    "Error al crear el registro"
            ).showAndWait();
            
        }
        
    }
    
    @FXML
    private void openFindPerson() throws IOException {
        
        Person person = this.findPerson();
        
        if (person != null) {
            
            this.nameConcessionaireTF.setText(person.getName());
            
            this.currentPerson = person;
            
        }
        
    }
    
    private Person findPerson() throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/soast/client/dialog/FindPersonFXML.fxml"
        ));
        
        Stage stage = new Stage();
        stage.setScene(new Scene((Pane) loader.load()));
        
        stage.setTitle("Buscar persona");
        
        FindPersonController controller = loader.<FindPersonController>getController();
        
        controller.initData(this.personsList);
        
        stage.showAndWait();
        
        return controller.getPerson();
    }
    
    
    private void initConcessionSection() {
        
        this.concessionTypeCB.getItems().addAll(
                "Tipo 1", 
                "Tipo 2"
        );
        
        this.unitTypeCB.getItems().addAll(
                "Tipo 1", 
                "Tipo 2"
        );
    }
    
    @FXML
    private void createConcession() throws DatatypeConfigurationException {
        
        String town = this.townTF.getText();
        String expeditionPlace = this.expeditionTF.getText();
        String licensePlate = this.licensePlateTF.getText();
        String concessionType = this.concessionTypeCB.getValue();
        String unitType = this.unitTypeCB.getValue();
        XMLGregorianCalendar expirationDate = this.getGCfromDate(this.expirationDP.getValue());
        XMLGregorianCalendar expeditionDate = this.getGCfromDate(LocalDate.now());
        
        if (this.currentPerson != null) {
            
            Long concessionId = SOASTController.createConcession(
                    this.currentPerson.getId(),
                    town, concessionType, expeditionDate,
                    expirationDate, expeditionPlace, 
                    unitType, licensePlate
            );
            
            if (concessionId != null) {
                
                soast.client.service.concession.Person person = new soast.client.service.concession.Person();
                person.setId(this.currentPerson.getId());
                person.setName(this.currentPerson.getName());
                
                Concession concession = new Concession();
                concession.setId(concessionId);
                concession.setPerson(person);
                concession.setTown(town);
                concession.setLicensePlate(licensePlate);
                concession.setExpeditionDate(expeditionDate);
                concession.setExpirationDate(expirationDate);
                concession.setExpeditionPlace(expeditionPlace);
                concession.setUnitType(unitType);
                concession.setConcessionType(concessionType);
                
                this.concessionsList.add(concession);
                
                StringBuilder builder = new StringBuilder();
                
                builder.append("<h1>" + "Usted ha sido acreedor de una nueva concesión en la SCT" + "</h1>");
                
                builder.append("<h2>Nombre del concesionario: <strong>").append(concession.getPerson().getName()).append("</strong></h2>");
                builder.append("<h2>Ciudad: <strong>").append(concession.getTown()).append("</strong></h2>");
                builder.append("<h2>Tipo de concesión: <strong>").append(concession.getConcessionType()).append("</strong></h2>");
                builder.append("<h2>Placas: <strong>").append(concession.getLicensePlate()).append("</strong></h2>");
                builder.append("<h2>Tipo de unidad: <strong>").append(concession.getUnitType()).append("</strong></h2>");
                builder.append("<h2>Fecha de vigencia: <strong>").append(concession.getExpirationDate().toString()).append("</strong></h2>");
                
                builder.append("<h4>Secretaria de comunicaciones y Transportes © </h4>");
                
                new Alert(AlertType.INFORMATION,
                        "Se ha creado exitosamente una nueva concession! ID = " + concessionId + ".\n" +
                        sendNotification(
                                concession.getPerson().getId(), "Secretaría de Transportes",
                                builder.toString()
                        )
                ).show();
                
            } else {
                
                new Alert(AlertType.INFORMATION,
                        "Error al crear el registro"
                ).showAndWait();
                
            }
            
        } else {
            
            new Alert(
                    AlertType.ERROR, "Por favor elija una persona"
            ).showAndWait();
            
        }
        
    }
    
    @FXML
    private void deleteConcession() {
        
        Concession concession = this.concessionsTV.getSelectionModel().getSelectedItem();
        
        Optional<ButtonType> option = new Alert(
                AlertType.CONFIRMATION,
                "Esta seguro de eliminar la concesión: " + concession.getId() + "?"
        ).showAndWait();
        
        if (option.get() == ButtonType.OK)
            
            if (SOASTController.deleteConcession(concession.getId())) {
                
                this.concessionsList.remove(concession);
                
                new Alert(
                        AlertType.INFORMATION,
                        "Se ha eliminado correctamente."
                ).showAndWait();
                
            }
        
    }
    
    private void initColumns() {
        
        this.deleteColumn.setCellFactory(new PropertyValueFactory("details"));
        
        Callback<TableColumn<Person, String>, TableCell<Person, String>> cellFactory =
                (TableColumn<Person, String> value) -> {
                    
                    TableCell<Person, String> cell = new TableCell<Person, String>() {
                        
                        @Override
                        protected void updateItem(String item, boolean empty) {
                            
                            JFXButton button = new JFXButton("Eliminar");
                            
                            button.setStyle("-fx-background-color: #EF6951;");
                            button.setTextFill(Paint.valueOf("WHITE"));
                            
                            super.updateItem(item, empty);
                            
                            if (empty) {
                                
                                super.setGraphic(null);
                                
                                super.setText(null);
                                
                            } else {
                                
                                button.setOnAction((ActionEvent event) -> {
                                    
                                    Person person = getTableView().getItems().get(super.getIndex());
                                    
                                    Optional<ButtonType> option = new Alert(
                                            AlertType.CONFIRMATION,
                                            "Esta seguro de eliminar al concesionario: " + person.getName() + "?"
                                    ).showAndWait();
                                    
                                    if (option.get() == ButtonType.OK)
                                        
                                        if (SOASTController.deletePerson(person.getId())) {
                                            
                                            personsList.remove(person);
                                            
                                            new Alert(
                                                    AlertType.INFORMATION,
                                                    "Se ha eliminado correctamente."
                                            ).showAndWait();
                                            
                                        }
                                    
                                });
                                
                                super.setGraphic(button);
                                
                                super.setAlignment(Pos.CENTER);
                                
                                super.setText(null);
                                
                            }
                            
                        }
                        
                    };
                    
                    return cell;
                    
                };
        
        this.deleteColumn.setCellFactory(cellFactory);
        
    }
    
    private XMLGregorianCalendar getGCfromDate(LocalDate date) 
            throws DatatypeConfigurationException {
        
        GregorianCalendar gcal = GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));
        
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
    }

    private void initCapacitacionSection() {
        this.capacitacionCB.getItems().addAll(
                "Idiomas",
                "Internacional",
                "Emprendimiento"
        );
        
        this.capacitacionCB.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    
                    List<Capacitaciones> list = capacitacionTipo(newValue.toLowerCase()).getListaCapacitaciones();
                    capacitacionesList.setAll(list);
        });
        
        this.capacitacionesTV.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue != null) 
                        objetivosTA.setText(newValue.getObjetivos());
                    
        });
        
    }

    private static AllCurso allCurso(java.lang.String entrada) {
        soast.client.service.curso.WsdlCursoService service = new soast.client.service.curso.WsdlCursoService();
        soast.client.service.curso.WsdlCursoPortType port = service.getWsdlCursoPort();
        return port.allCurso(entrada);
    }

    private void initCursosSection() {
        
        this.cursosTV.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue != null){
                        objetivosCursoTA.setText(newValue.getObjetivos());
                        descripcionCursoTA.setText(newValue.getDescripcion());
                    } 
                    
        });
    }
    
    /* Concessionaire */
    
    private static Long createPerson(java.lang.String name, java.lang.String rfc, java.lang.String address, java.lang.String nacionality, javax.xml.datatype.XMLGregorianCalendar birthday, java.lang.String email, java.lang.String cellphone) {
        soast.client.sevice.person.PersonWS_Service service = new soast.client.sevice.person.PersonWS_Service();
        soast.client.sevice.person.PersonWS port = service.getPersonWSPort();
        return port.createPerson(name, rfc, address, nacionality, birthday, email, cellphone);
    }

    private static boolean deletePerson(java.lang.Long personId) {
        soast.client.sevice.person.PersonWS_Service service = new soast.client.sevice.person.PersonWS_Service();
        soast.client.sevice.person.PersonWS port = service.getPersonWSPort();
        return port.deletePerson(personId);
    }

    private static java.util.List<soast.client.sevice.person.Person> listPersons() {
        soast.client.sevice.person.PersonWS_Service service = new soast.client.sevice.person.PersonWS_Service();
        soast.client.sevice.person.PersonWS port = service.getPersonWSPort();
        return port.listPersons();
    }
    
    /* Concession */

    private static Long createConcession(java.lang.Long idPerson, java.lang.String town, java.lang.String concessionType, javax.xml.datatype.XMLGregorianCalendar expeditionDate, javax.xml.datatype.XMLGregorianCalendar expirationDate, java.lang.String expeditionPlace, java.lang.String unitType, java.lang.String licensePlate) {
        soast.client.service.concession.ConcessionWS_Service service = new soast.client.service.concession.ConcessionWS_Service();
        soast.client.service.concession.ConcessionWS port = service.getConcessionWSPort();
        return port.createConcession(idPerson, town, concessionType, expeditionDate, expirationDate, expeditionPlace, unitType, licensePlate);
    }

    private static boolean deleteConcession(java.lang.Long idConcession) {
        soast.client.service.concession.ConcessionWS_Service service = new soast.client.service.concession.ConcessionWS_Service();
        soast.client.service.concession.ConcessionWS port = service.getConcessionWSPort();
        return port.deleteConcession(idConcession);
    }

    private static java.util.List<soast.client.service.concession.Concession> listConcession() {
        soast.client.service.concession.ConcessionWS_Service service = new soast.client.service.concession.ConcessionWS_Service();
        soast.client.service.concession.ConcessionWS port = service.getConcessionWSPort();
        return port.listConcession();
    }

    private static String sendNotification(java.lang.Long personId, java.lang.String subject, java.lang.String message) {
        soast.client.service.notification.NotificationWS_Service service = new soast.client.service.notification.NotificationWS_Service();
        soast.client.service.notification.NotificationWS port = service.getNotificationWSPort();
        return port.sendNotification(personId, subject, message);
    }

    private static Capacitacion capacitacionTipo(java.lang.String tipo) {
        soast.client.service.capacitacion.CapacitacionWSDLService service = new soast.client.service.capacitacion.CapacitacionWSDLService();
        soast.client.service.capacitacion.CapacitacionWSDLPortType port = service.getCapacitacionWSDLPort();
        return port.capacitacionTipo(tipo);
    }

}
