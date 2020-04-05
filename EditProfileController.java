package views;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Customer;
import models.User;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class EditProfileController implements Initializable {

    @FXML private TextField UserID;
    @FXML private TextField firstName;
    @FXML private TextField lastName;
    @FXML private TextField address;
    @FXML private Button saveChanges;
    @FXML private Button deleteProfile;

    private Customer customer;

    /**
     * This will update the changes made to a user profile, when the button is pushed.
     * @param event
     * @throws IOException
     */
    public void saveChangesButtonPushed(ActionEvent event) throws IOException, SQLException {
        updateUser();
        customer.updateCustomerInDB();

        SceneChanger sc = new SceneChanger();
        sc.changeScenes(event, "sample.fxml", "profileView");
    }

    /**
     * This will delete the customer profile when the button is pushed. Removing it from the database.
     * @param event
     * @throws IOException
     */
    public void deleteButtonPushed(ActionEvent event) throws IOException, SQLException {
        updateUser();
        this.deleteProfile();

        SceneChanger sc = new SceneChanger();
        sc.changeScenes(event, "loginView.fxml", "LoginPage");
    }

    /**
     * This method will update the view with a customer object preloaded for an edit
     * @param customer
     */
    @Override
    public void preloadData(Customer customer){
        this.customer = customer;
        this.firstName.setText(customer.get_firstName());
        this.lastName.setText(customer.get_lastName());
        this.address.setText(customer.get_address());
    }

    /**
     * This method will read from the GUI fields and update the user object.
     */
    public void updateUser(){
        customer.set_firstName(firstName.getText());
        customer.set_lastName(lastName.getText());
        customer.set_address(address.getText());
    }

    /**
     * This method will delete the customer details from the database. They will no longer have an account.
     */
    public void deleteProfile() throws SQLException {
        customer.deleteProfile();
    }

    /**
     * Imititalizes the controller class.
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO
    }
}
