E-Commerce Application
Overview
This is a full-stack e-commerce application built using Spring Boot for the backend. It provides functionalities for adding, retrieving, updating, and deleting products.
Features
* Product Management (CRUD operations)
* Category Management
* User Authentication & Authorization
* Order Processing
* Database Integration with MySQL
* REST API Implementation
* Spring Security for Secure Access
* Swagger API Documentation
Technologies Used
* Backend: Spring Boot, Spring Data JPA, Spring Security, Hibernate
* Database: MySQL
* API Testing: Postman, Swagger
* Version Control: Git, GitHub
Installation
Prerequisites
* Java 17+
* Spring Boot 3+
* MySQL Database
* Postman (Optional for testing API)
* Git
Steps to Setup the Project
1. Clone the repository:
2. git clone https://github.com/yourusername/ecommerce-springboot.git
3. Navigate to the project directory:
4. cd ecommerce-springboot
5. Configure the MySQL database:
o Open application.properties or application.yml in src/main/resources/
o Update database configurations:
o spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
o spring.datasource.username=root
o spring.datasource.password=yourpassword
6. Run the application:
7. mvn spring-boot:run
8. Access the API at http://localhost:8080
API Endpoints
MethodEndpointDescriptionGET/productsGet all productsPOST/productsAdd a new productPUT/products/{id}Update a productDELETE/products/{id}Delete a productContributing
1. Fork the repository
2. Create a feature branch (git checkout -b feature-branch)
3. Commit your changes (git commit -m "Add new feature")
4. Push to the branch (git push origin feature-branch)
5. Open a Pull Request

