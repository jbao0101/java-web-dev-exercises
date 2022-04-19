package org.launchcode.java.studios.restaurant;

public class MenuItem {
    private Double price;
    private String description;
    private String category;
    private Boolean newItem;
    private String date;

    public MenuItem(Double price, String description, String category, Boolean newItem, String date){
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
        this.date = date;
    }

    public String menuInfo(){
        return(this.category + ": " + this.description + " costs $" + this.price + " and was added to our menu " + this.date);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNewItem() {
        return newItem;
    }

    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
