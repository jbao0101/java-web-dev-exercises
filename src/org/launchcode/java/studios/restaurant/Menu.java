package org.launchcode.java.studios.restaurant;

public class Menu {
    public static void main(String[] args){
        MenuItem wings = new MenuItem(10.99, "hot wings 6 piece", "appetizer", true, "4/18/2022");
        System.out.println(wings.menuInfo());
    }
}
