package sample;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable {
    public DavidsTeaManage dbconnection = new DavidsTeaManage();

    @FXML
    private Label isConnected;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        if (dbconnection.isDBConnected()){
            isConnected.setText("Connected.");
        }
        else{
            isConnected.setText("Connection unsuccessful.");
        }
    }
}
