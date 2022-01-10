package Models;

import java.util.Objects;

public class Product {
    private int id;
    private double price;
    private String sku;
    private int stock;

    public Product(int id,double price, String sku, int stock) {
        this.id = id;
        this.price = price;
        this.sku = sku;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
