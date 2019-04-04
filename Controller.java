package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller{

    public void organizeInventory(){
        System.out.println("organized");
    }

    public void addSomething(){
        Popup.display();

    }

    public void removeItem(){
        System.out.println("removed");
    }
}
