/**
 * Manager Homepage Controller Class.
 * @author Emily Wells
 */
package staffViews;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ManagerHomepageController implements Initializable {
    @FXML
    private Label errMsgLabel;

    /**
     * Initialises controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){

        errMsgLabel.setText("");

    }
}
