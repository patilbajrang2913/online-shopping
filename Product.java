package com.shopping.model;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private int categoryId;

    // Constructors, getters, setters
    public Product() {}

    public Product(String name, String description, double price, int stock, int categoryId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.categoryId = categoryId;
    }

    // Getters and setters for all fields
    // ...
}