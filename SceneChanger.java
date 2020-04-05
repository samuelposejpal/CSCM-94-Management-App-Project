package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Customer;
import models.User;

import java.io.IOException;

public class SceneChanger {

    /**
     * This method will accept the title of the new scene, the .fmxl file name for the
     * view and the ActionEvent that triggered that change.
     */
    public void changeScenes(ActionEvent event, String viewName, String title) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(viewName));
        Parent parent = loader.load();

        Scene scene = new Scene(parent);

        //get the stage from the event that was passed in.
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * This method will change scenes and preload the next scene with a User object.
     */
    public void changeScenes(ActionEvent event, String viewName, String title, User user, EditProfileController controllerClass) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(viewName));
        Parent parent = loader.load();

        Scene scene = new Scene(parent);

        //access the controller class to preload the data.
        controllerClass = loader.getController();
        controllerClass.preloadData(user);

        //get the stage from the event that was passed in.
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();

        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
}
