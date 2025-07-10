package com.shopping.model;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String address;
    private String phone;
    private String role; // "admin" or "customer"

    // Constructors, getters, setters
    public User() {}

    public User(String username, String password, String email, String address, String phone, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.role = role;
    }

    // Getters and setters for all fields
    // ...
}