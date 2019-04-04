package sample;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

import javax.xml.soap.Text;


public class Popup {

    public static void display() {

        Stage popupwindow = new Stage();
        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setTitle("Add item to a table");

        Label label1 = new Label("What item do you want to add?");
        Button buttonClose = new Button("Close this pop up window");
        Button buttonTea = new Button("Add a tea");
        Button buttonTea_Lips = new Button("Add a lip balm");
        Button buttonTea_Treats = new Button("Add a treat");
        Button buttonTeaware = new Button("Add a teaware");

        buttonClose.setOnAction(e -> popupwindow.close());
        buttonTea.setOnAction(e -> addTea());
        VBox layout = new VBox(10);

        layout.getChildren().addAll(label1, buttonClose, buttonTea, buttonTea_Lips, buttonTea_Treats, buttonTeaware);
        layout.setAlignment(Pos.CENTER);

        Scene scene1 = new Scene(layout, 350, 250);
        popupwindow.setScene(scene1);
        popupwindow.showAndWait();
    }
    public static void addTea(){

        String itemNum, name, description, type, pricePer50g,caffeineLevel, stock;
        Stage addTeaWindow = new Stage();
        addTeaWindow.initModality(Modality.APPLICATION_MODAL);
        addTeaWindow.setTitle("Add a tea");

        Label label1 = new Label("What tea do you want to add?");
        TextField enterItemNum = new TextField("Enter a number greater than 334");
        TextField enterName = new TextField("Enter a name for your product");
        TextField enterDescription = new TextField("Enter a description");
        TextField enterType = new TextField("What type of tea is it?");
        TextField enterPricePer50g = new TextField("Enter the price per 50 grams");
        TextField enterCaffeineLevel = new TextField("Enter the caffeine level: Caffeine-free, low, medium, high");
        TextField enterStock = new TextField("Enter the available stock");

        Button buttonAddTea = new Button("Add tea");
        buttonAddTea.setOnAction(e -> checkTextFields("tea",));

        Button buttonClose = new Button("Close this pop up window");
        buttonClose.setOnAction(e -> addTeaWindow.close());



        VBox layout = new VBox(10);
        layout.getChildren().addAll(label1, enterItemNum, enterName, enterDescription, enterType, enterPricePer50g, enterCaffeineLevel, enterStock, buttonClose);
        //layout.setAlignment(Pos.CENTER);

        Scene addTeaScene = new Scene(layout, 500, 450);
        addTeaWindow.setScene(addTeaScene);
        addTeaWindow.showAndWait();
        System.out.println("prints when the window is closed");
    }
    public static void checkTextFields(String methodCaller, String itemNum, String name, String description, String type, String pricePer50g, String caffeineLevel, String stock){

        switch(methodCaller){
            case "tea":
                break;
            case "lip balm":
                break;
            case "treat":
                break;
            case "teaware":
                break;
        }
    }
}
