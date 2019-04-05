package davidsteaapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DavidsTeaApp extends Application {
    public void start(Stage stage) throws Exception{
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("davidstea.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("David's Tea Inventory Management System");
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
