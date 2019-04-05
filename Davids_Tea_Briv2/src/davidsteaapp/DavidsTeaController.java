package davidsteaapp;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DavidsTeaController implements Initializable {

    ConnectDB connectDB = new ConnectDB();

    @FXML
    private Label dbStatus;

    public void initialize(URL url, ResourceBundle rb){
        if(this.connectDB.isDBConnected()){
            this.dbStatus.setText("Connection Successful.");
        }
        else{
            this.dbStatus.setText("Connection Unsuccessful.");
        }
    }
}
