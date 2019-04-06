package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("davidstea.fxml"));
        primaryStage.setTitle("David's Tea Inventory Management System");
        primaryStage.setScene(new Scene(root, 1050, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

/*        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:davids_tea.db");

            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS Tea(item_num INTEGER, name TEXT, description TEXT, type TEXT, price/50g NUMERIC, caffeine_level TEXT, stock INTEGER)");
            statement.execute("CREATE TABLE IF NOT EXISTS Tea_Lips(item_num INTEGER, name TEXT, description TEXT, price NUMERIC, stock INTEGER)");
            statement.execute("CREATE TABLE IF NOT EXISTS Tea_Treats(item_num INTEGER, name TEXT, description TEXT, price NUMERIC, stock INTEGER");
            statement.execute("CREATE TABLE IF NOT EXISTS Teaware(item_num INTEGER, name TEXT, description TEXT, price NUMERIC, stock INTEGER");

        }catch (SQLException e){
            System.out.println("Something went wrong. " + e.getMessage());
        }*/
    }
}
