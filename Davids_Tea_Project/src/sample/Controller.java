package sample;

import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import dbUtil.DBConnection;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    TableView<DavidsTeaData> davidsdata;
    @FXML
    TableColumn<DavidsTeaData, String>itemnumbercolumn;
    TableColumn<DavidsTeaData, String>namecolumn;
    TableColumn<DavidsTeaData, String>descriptioncolumn;
    TableColumn<DavidsTeaData, String>typecolumn;
    TableColumn<DavidsTeaData, String>priceper50gcolumn;
    TableColumn<DavidsTeaData, String>caffeinelevelcolumn;
    TableColumn<DavidsTeaData, String>stockcolumn;

    ObservableList<DavidsTeaData> data;
    DBConnection databaseConnection;
    String tableSelect = "SELECT*FROM Tea";

    public void initialize(URL url, ResourceBundle resourceBundle){ this.databaseConnection = new DBConnection(); }

    @FXML
    public void loadDavidsTeaData() {
        try {
            Connection conn = DBConnection.getConnection();
            this.data = FXCollections.observableArrayList();
            ResultSet results = conn.createStatement().executeQuery(tableSelect);

            while (results.next()) {
                this.data.add(new DavidsTeaData(results.getString(1), results.getString(2), results.getString(3), results.getString(4), results.getString(5), results.getString(6), results.getString(7)));
            }
        } catch (SQLException e) {
            System.out.println("Something went wrong. " + e);
        }
        // code here causes the method to fail... don't know how to fix it
        this.itemnumbercolumn.setCellValueFactory(new PropertyValueFactory<DavidsTeaData, String>("itemNum"));
        this.namecolumn.setCellValueFactory(new PropertyValueFactory<DavidsTeaData, String>("name"));
        this.descriptioncolumn.setCellValueFactory(new PropertyValueFactory<DavidsTeaData, String>("description"));
        this.typecolumn.setCellValueFactory(new PropertyValueFactory<DavidsTeaData, String>("type"));
        this.priceper50gcolumn.setCellValueFactory(new PropertyValueFactory<DavidsTeaData, String>("priceper50g"));
        this.caffeinelevelcolumn.setCellValueFactory(new PropertyValueFactory<DavidsTeaData, String>("caffeinelevel"));
        this.stockcolumn.setCellValueFactory(new PropertyValueFactory<DavidsTeaData, String>("stock"));

        this.davidsdata.setItems(null);
        this.davidsdata.setItems(this.data);
    }

public void addSomething(){
        Popup.addItem();
    }

    public void removeItem(){
        System.out.println("removed");
    }
}
