#CONTRIBUTING:
1. VAISHALI CHARGUNDI(SESP)
 2. BAJRANG PATIL(SESP)

#ONLINE SHOPPING CONSOLE APPLICATION
Online Shopping Console Application Overview A Java-based console application for an online shopping system with user authentication, product management, and order processing capabilities. Features User Features User registration and login
1.	Customer and admin role differentiation
2.	Product browsing (for customers)
3.	Shopping cart functionality (placeholder)
4.	Order history (placeholder)
5.	Admin Features Product management (add/edit/delete)
6.	Order viewing (placeholder)
7.	User management (placeholder)
--------------------------------------------------------------------------------------------------------------------------------
1. DATABASE.PROPERTIES
   •	Purpose: Stores database connection configuration
•	Contents:
     o	JDBC URL for MySQL database (online_shopping_db)
     o	Database username and password
     o	MySQL JDBC driver class
•	Usage: Read by DBConnection.java to establish database connections
--------------------------------------------------------------------------------------------------------------------------------
2.DBConnection.java
•	Package: com.shopping.dao
•	Purpose: Manages database connections using JDBC
•	Key Features:
     o	Singleton pattern (single shared connection)
     o	Loads connection properties from database.properties
     o	Handles connection creation with DriverManager
     o	Catches and prints SQL/connection errors

--------------------------------------------------------------------------------------------------------------------------------
3.InputUtil.java
  Package: com.shopping.util
•	Purpose: Utility class for handling user input
•	Methods:
    o	getIntInput(): Validates and returns integer input
    o	getDoubleInput(): Validates and returns decimal input
•	Features:
   o	Prevents program crashes from invalid numeric input
   o	Provides user-friendly error messages
   
----------------------------------------------------------------------------------------------------------------------------
4.pom.xml
•	Purpose: Maven project configuration file
•	Key Sections:
   o	Dependencies:
       	MySQL Connector/J (database access)
       	Log4j (logging)
       	JUnit (testing)
  o	Build Settings:
       	Java 11 compatibility
       	UTF-8 encoding
       	Compiler plugin configuration

-----------------------------------------------------------------------------------------------------------------------------
5.Main.java
 •	Package: com.shopping
•	Purpose: Entry point and main controller for the application
•	Key Components:
    o	Menus:
        	showMainMenu(): Registration/login for unauthenticated users
        	showAdminMenu(): Product/order management for admins
        	showCustomerMenu(): Shopping features for customers
    o	Core Methods:
        	registerUser(): Handles new user registration
        	loginUser(): Authenticates users
    o	State Management:
        	Tracks currentUser to control access to features

-----------------------------------------------------------------------------------------------------------------------------
6.Product.java
 •	Package: com.shopping.model
•	Purpose: Entity class representing products
•	Fields:
    o	id, name, description, price, stock, categoryId
•	Features:
   o	Default and parameterized constructors
   o	Placeholder for getters/setters (not shown in full)
   
-----------------------------------------------------------------------------------------------------------------------------
7.ProductService.java
•	Package: com.shopping.service
•	Purpose: Business logic layer for product operations
•	Methods:
    o	CRUD operations (getAllProducts(), addProduct(), etc.)
    o	Delegates to ProductDAO for data access
•	Design:
    o	Follows service layer pattern
    o	Abstracts database operations from controllers
    
----------------------------------------------------------------------------------------------------------------------------
8.User.java
 •	Package: com.shopping.model
•	Purpose: Entity class representing users
•	Fields:
     o	id, username, password, email, address, phone, role
•	Role System:
    o	"admin" or "customer" (enables role-based access)
•	Features:
    o	Constructors for object creation
    o	Placeholder for getters/setters
    
----------------------------------------------------------------------------------------------------------------------------
9.UserDAO.java
package: com.shopping.dao
•	Purpose: Data access layer for user operations
•	Key Methods:
     o	registerUser(): Inserts new users into database
           	Uses prepared statements to prevent SQL injection
     o	login(): Authenticates users against database
           	Returns User object if credentials match
•	Error Handling:
     o	Prints stack traces for SQL errors
     o	Returns false/null for failed operations
     
----------------------------------------------------------------------------------------------------------------------------
Architecture Overview:
1.	Presentation Layer: Main.java (console interface)
2.	Service Layer: *Service.java classes (business logic)
3.	Data Access Layer: *DAO.java classes (database operations)
4.	Model Layer: *.model classes (data entities)
5.	Utility Layer: InputUtil.java (shared functionality)

-------------------------------------------------------------------------------------------------------------------------
Data Flow Example (User Registration)
1.	Main.showMainMenu() → User selects registration
2.	Main.registerUser() → Collects user input
3.	Creates User object with input data
4.	Calls UserService.registerUser()
5.	Delegates to UserDAO.registerUser()
6.	DBConnection provides database connection
7.	Result propagates back up to display success/failure
----------------------------------------------------------------------------------------------------------------------------
Key Design Patterns Used
1.	Singleton: DBConnection (single shared connection)
2.	DAO Pattern: Separation of data access logic
3.	MVC-like Structure: Separation of concerns
4.	Service Layer: Business logic encapsulation
----------------------------------------------------------------------------------------------------------------------------
output:
<img width="328" height="624" alt="image" src="https://github.com/user-attachments/assets/98b023d0-fe48-43ab-977a-f5d7e7b5a5ff" />
<img width="634" height="673" alt="image" src="https://github.com/user-attachments/assets/cd3caf4c-6223-4b20-9b6c-57e1b01c3961" />
<img width="328" height="135" alt="image" src="https://github.com/user-attachments/assets/870e52cf-b65d-4a8f-96b4-9a407932dc98" />
