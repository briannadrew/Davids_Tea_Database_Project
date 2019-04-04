package sample;

import java.sql.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("David's Tea Product Management");
        primaryStage.setScene(new Scene(root, 1750, 900));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}