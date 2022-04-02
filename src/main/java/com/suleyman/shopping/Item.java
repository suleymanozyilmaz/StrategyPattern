package com.suleyman.shopping;

public class Item {

    private String barcode;
    private double price;

    public Item(String barcode, double cost) {
        this.barcode = barcode;
        this.price = cost;
    }
    public String getBarcode() {
        return barcode;
    }
    public double getPrice() {
        return price;
    }



}
