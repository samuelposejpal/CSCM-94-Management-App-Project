package views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LaunchEditProfile extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("views/EditProfileView.fxml"));

        AnchorPane editProfile = loader.load();

        Scene editProfileScene = new Scene(editProfile);
        primaryStage.setScene(editProfileScene);
        primaryStage.setTitle("Edit Profile");
        primaryStage.show();

    }
}
