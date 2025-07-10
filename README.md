#Contributing:
 1. vaishali chargundi
 2. bajrang patil
    
# online-shopping


Online Shopping Console Application
Overview
A Java-based console application for an online shopping system with user authentication, product management, and order processing capabilities.
Features
User Features
User registration and login

Customer and admin role differentiation

Product browsing (for customers)

Shopping cart functionality (placeholder)

Order history (placeholder)

Admin Features
Product management (add/edit/delete)

Order viewing (placeholder)

User management (placeholder)

Technologies Used
Java 11

MySQL Database

JDBC for database connectivity

Maven for dependency management

Log4j for logging

JUnit for testing (placeholder)

#Installation
Prerequisites
Java JDK 11 or later

MySQL Server 8.0 or later

Maven 3.6 or later


#Project Structure
src/
├── main/
│   ├── java/
│   │   ├── com/shopping/
│   │   │   ├── dao/        # Data access objects
│   │   │   ├── model/      # Data models
│   │   │   ├── service/    # Business logic
│   │   │   ├── util/       # Utility classes
│   │   │   └── Main.java   # Entry point
│   ├── resources/
│   │   └── database.properties # DB configuration
└── test/                   # Test classes


#Configuration
Edit src/main/resources/database.properties to configure your database connection:

db.url=jdbc:mysql://localhost:3306/online_shopping_db
db.username=your_username
db.password=your_password
db.driver=com.mysql.cj.jdbc.Driver

#Usage
Start the application

Register as a new user or login with existing credentials

Use the menu system to navigate features:

Customers can browse products and manage their cart

Admins can manage products and view orders

#Future Enhancements
Implement complete shopping cart functionality

Add order processing system

Implement payment gateway integration

Develop web interface

Add product search and filtering


    out out:
    <img width="328" height="624" alt="image" src="https://github.com/user-attachments/assets/98b023d0-fe48-43ab-977a-f5d7e7b5a5ff" />
    <img width="634" height="673" alt="image" src="https://github.com/user-attachments/assets/cd3caf4c-6223-4b20-9b6c-57e1b01c3961" />
    <img width="328" height="135" alt="image" src="https://github.com/user-attachments/assets/870e52cf-b65d-4a8f-96b4-9a407932dc98" />


