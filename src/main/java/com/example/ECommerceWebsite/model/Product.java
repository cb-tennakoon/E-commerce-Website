package com.example.ECommerceWebsite.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Product {
    @Id
    @GeneratedValue
    private int productId;
    private String prodName;
    private double price;

    public Product(){

    }
    public Product(int productId, String prodName, double price) {
        this.productId = productId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
