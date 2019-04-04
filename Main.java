package sample;
import java.sql.*;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 500, 450));
        primaryStage.show();
    }

/*   Tried and tried to get this to load a new stage so we could edit it, but nothing I would try would fix the problem
     and I Googled the error, but it said it was a problem with the classpath, and I tried to edit line 27 multiple times to no avail
    @FXML
    public void addItemToTable() {
        try {
            Parent root1 = FXMLLoader.load(getClass().getResource("D:\\Trent University\\Undergraduate Year 2\\Second Semester\\Davids__Tea_Project\\src\\sample\\addItem.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
        launch(args);

        try {
            Connection conn = DriverManager.getConnection("D:\\Trent University\\Undergraduate Year 2\\Second Semester\\Davids__Tea_Project\\davids_tea.db");

            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS Tea(item_num INTEGER, name TEXT, description TEXT, type TEXT, price/50g NUMERIC, caffeine_level TEXT, stock INTEGER)");
            statement.execute("CREATE TABLE IF NOT EXISTS Tea_Lips(item_num INTEGER, name TEXT, description TEXT, price NUMERIC, stock INTEGER)");
            statement.execute("CREATE TABLE IF NOT EXISTS Tea_Treats(item_num INTEGER, name TEXT, description TEXT, price NUMERIC, stock INTEGER");
            statement.execute("CREATE TABLE IF NOT EXISTS Teaware(item_num INTEGER, name TEXT, description TEXT, price NUMERIC, stock INTEGER");

        }catch (SQLException e){
            System.out.println("Something went wrong. " + e.getMessage());
        }
    }
}
