/**
 * Chef Home Page Controller Class.
 * @author Emily Wells
 */
package staffViews;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class ChefHomepageController implements Initializable {
    @FXML private Label errMsgLabel;
    @FXML private Button profileButton;
    @FXML private Button menuManagementButton;
    @FXML private Button completedOrdersButton;
    @FXML private Button currentOrdersButton;
    @FXML private Button logoutButton;

    /**
     * Initialises controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){

        errMsgLabel.setText("");

    }
}
