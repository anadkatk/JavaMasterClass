package com.Car;
public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if(price>0){
            this.price = price;
        }

    }

    public void adjustQuantity(int quantity){
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity>=0){
            this.quantityStock = newQuantity;
        }

    }

    @Override
    public int compareTo(StockItem o) {
        return 0;
    }
}
