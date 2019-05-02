package com.example.java;

public class ClothingItem {
    public String type;
    public static void main(String [] args){
        ClothingItem item = new ClothingItem();
        item.type = "Hat";
        item.displayItemm();

    }
    public void displayItemm(){
        System.out.println("This is a " + this.type);
    }
}
