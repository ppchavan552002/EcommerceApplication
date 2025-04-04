# 🛍️ E-Commerce Application

## 📌 Overview
This is a **full-stack** e-commerce application built with **Spring Boot** as the backend. It provides functionalities such as **product management, user authentication, order processing**, and more.

## 🚀 Features
✔️ Product Management (CRUD operations)  
✔️ Category Management  
✔️ User Authentication & Authorization  
✔️ Order Processing  
✔️ Database Integration with **MySQL**  
✔️ REST API with **Spring Boot**  
✔️ Secure Access using **Spring Security**  
✔️ API Documentation with **Swagger**  

## 🛠️ Technologies Used
- **Backend:** Spring Boot, Spring Data JPA, Spring Security, Hibernate  
- **Database:** MySQL  
- **API Testing:** Postman, Swagger  
- **Version Control:** Git, GitHub  

---

## ⚙️ Installation Guide

### ✅ Prerequisites
Make sure you have the following installed on your system:  
🔹 **Java 17+**  
🔹 **Spring Boot 3+**  
🔹 **MySQL Database**  
🔹 **Git**  
🔹 **Postman (Optional for API Testing)**  

### 🔹 Steps to Set Up the Project

1️⃣ **Clone the Repository**  
```sh
git clone https://github.com/yourusername/ecommerce-springboot.git
```

2️⃣ **Navigate to the Project Directory**  
```sh
cd ecommerce-springboot
```

3️⃣ **Configure MySQL Database**  
- Open `application.properties` or `application.yml` in `src/main/resources/`
- Update the database configurations:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
  spring.datasource.username=root
  spring.datasource.password=yourpassword
  ```

4️⃣ **Run the Application**  
```sh
mvn spring-boot:run
```

5️⃣ **Access the API**  
Visit: [`http://localhost:8080`](http://localhost:8080)  

---

## 📌 API Endpoints

| HTTP Method | Endpoint       | Description       |
|------------|--------------|-----------------|
| **GET**    | `/products`      | Get all products  |
| **POST**   | `/products`      | Add a new product |
| **PUT**    | `/products/{id}` | Update a product  |
| **DELETE** | `/products/{id}` | Delete a product  |

---

## 🤝 Contributing
Want to contribute? Follow these steps:  
1️⃣ **Fork** the repository  
2️⃣ Create a feature branch  
   ```sh
   git checkout -b feature-branch
   ```
3️⃣ Commit your changes  
   ```sh
   git commit -m "Added new feature"
   ```
4️⃣ Push to GitHub  
   ```sh
   git push origin feature-branch
   ```
5️⃣ Open a **Pull Request**  

---

## 📜 License
This project is licensed under the **MIT License**.

---

## 📧 Contact
For any queries, feel free to reach out via **GitHub Issues** or email at:  
📩 `your-email@example.com`
