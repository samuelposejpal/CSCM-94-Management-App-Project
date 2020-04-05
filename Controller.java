package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Customer;

import java.io.IOException;

import static javafx.application.Application.launch;

public class Controller {

    @FXML private Button editProfile;
    @FXML private TableView<Customer> customerTable;


    public static void main(String[] args){
        launch(args);
    }

    /*
     * This will allow the user to edit their profile details and option to delete their profile. .
     * @param event
     */
    public void EditProfileButtonPushed(ActionEvent event) throws IOException {

        SceneChanger sc = new SceneChanger();
        Customer customer = this.customerTable.getSelectionModel().getSelectedItem();
        EditProfileController editProfile = new EditProfileController();
        sc.changeScenes(event, "EditProfile.fxml", "Edit User", customer, editProfile);
    }

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("views/EditProfileView.fxml"));

        AnchorPane editProfile = loader.load();

        Scene editProfileScene = new Scene(editProfile);
        primaryStage.setScene(editProfileScene);
        primaryStage.setTitle("Edit Profile");
        primaryStage.show();

    }
    //TODO
    /*
    public void HomeButton(){
        Stage mainStage = (Stage) iView.getScene().
    }*/

}
