package sample;

import javafx.beans.property.*;
import javafx.css.SimpleStyleableIntegerProperty;

public class DavidsTeaData {

    StringProperty itemNum;
    StringProperty name;
    StringProperty description;
    StringProperty type;
    StringProperty pricePer50g;
    StringProperty caffeineLevel;
    StringProperty stock;

    public DavidsTeaData(String itemNum, String name, String description, String type, String pricePer50g, String caffieneLevel, String stock){
        this.itemNum = new SimpleStringProperty(itemNum);
        this.name = new SimpleStringProperty(name);
        this.description = new SimpleStringProperty(description);
        this.type = new SimpleStringProperty(type);
        this.pricePer50g = new SimpleStringProperty(pricePer50g);
        this. caffeineLevel = new SimpleStringProperty(caffieneLevel);
        this.stock = new SimpleStringProperty(stock);
    }

    public String getItemNum() {
        return itemNum.get();
    }

    public StringProperty itemNumProperty() {
        return itemNum;
    }

    public void setItemNum(String itemNum) {
        this.itemNum.set(itemNum);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getDescription() {
        return description.get();
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public String getType() {
        return type.get();
    }

    public StringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public String getPricePer50g() {
        return pricePer50g.get();
    }

    public StringProperty pricePer50gProperty() {
        return pricePer50g;
    }

    public void setPricePer50g(String pricePer50g) {
        this.pricePer50g.set(pricePer50g);
    }

    public String getCaffeineLevel() {
        return caffeineLevel.get();
    }

    public StringProperty caffeineLevelProperty() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(String caffeineLevel) {
        this.caffeineLevel.set(caffeineLevel);
    }

    public String getStock() {
        return stock.get();
    }

    public StringProperty stockProperty() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock.set(stock);
    }

}
