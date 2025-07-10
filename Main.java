package com.shopping;

import com.shopping.model.User;
import com.shopping.service.UserService;
import com.shopping.service.ProductService;
import com.shopping.util.InputUtil;

import java.util.Scanner;

public class Main {
    private static UserService userService = new UserService();
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);
    private static User currentUser = null;

    public static void main(String[] args) {
        System.out.println("Welcome to Online Shopping System!");
        
        while (true) {
            if (currentUser == null) {
                showMainMenu();
            } else {
                if ("admin".equals(currentUser.getRole())) {
                    showAdminMenu();
                } else {
                    showCustomerMenu();
                }
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("\n1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        
        int choice = InputUtil.getIntInput(scanner);
        
        switch (choice) {
            case 1:
                registerUser();
                break;
            case 2:
                loginUser();
                break;
            case 3:
                System.out.println("Thank you for using our system!");
                System.exit(0);
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }

    private static void registerUser() {
        System.out.println("\n--- User Registration ---");
        System.out.print("Enter username: ");
        String username = scanner.next();
        
        System.out.print("Enter password: ");
        String password = scanner.next();
        
        System.out.print("Enter email: ");
        String email = scanner.next();
        
        System.out.print("Enter address: ");
        scanner.nextLine(); // Consume newline
        String address = scanner.nextLine();
        
        System.out.print("Enter phone: ");
        String phone = scanner.next();
        
        User newUser = new User(username, password, email, address, phone, "customer");
        if (userService.registerUser(newUser)) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed. Username may already exist.");
        }
    }

    private static void loginUser() {
        System.out.println("\n--- User Login ---");
        System.out.print("Enter username: ");
        String username = scanner.next();
        
        System.out.print("Enter password: ");
        String password = scanner.next();
        
        currentUser = userService.login(username, password);
        if (currentUser != null) {
            System.out.println("Login successful! Welcome, " + currentUser.getUsername());
        } else {
            System.out.println("Invalid username or password!");
        }
    }

    private static void showAdminMenu() {
        System.out.println("\n--- Admin Menu ---");
        System.out.println("1. Manage Products");
        System.out.println("2. View All Orders");
        System.out.println("3. Logout");
        System.out.print("Enter your choice: ");
        
        int choice = InputUtil.getIntInput(scanner);
        
        switch (choice) {
            case 1:
                manageProducts();
                break;
            case 2:
                viewAllOrders();
                break;
            case 3:
                currentUser = null;
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }

    private static void showCustomerMenu() {
        System.out.println("\n--- Customer Menu ---");
        System.out.println("1. Browse Products");
        System.out.println("2. View Cart");
        System.out.println("3. View Orders");
        System.out.println("4. Logout");
        System.out.print("Enter your choice: ");
        
        int choice = InputUtil.getIntInput(scanner);
        
        switch (choice) {
            case 1:
                browseProducts();
                break;
            case 2:
                viewCart();
                break;
            case 3:
                viewOrders();
                break;
            case 4:
                currentUser = null;
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }

    // Other methods for product management, cart operations, etc.
    // ...
}