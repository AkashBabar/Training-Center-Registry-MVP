# Training Center Registry MVP

## 📌 Project Overview
This is an MVP (Minimum Viable Product) for a **Training Center Registry** that manages government-funded training centers. The application is built using **Spring Boot** and **MySQL** and follows best practices for API development.

## 🚀 Tech Stack
- **Backend:** Spring Boot (Java)
- **Database:** MySQL
- **ORM:** JPA (Hibernate)
- **Validation:** Jakarta Validation
- **Build Tool:** Maven

## 💒 Project Structure
```
TrainingCenter-Registry-MVP/
│── src/
│   ├── main/
│   │   ├── java/com/mvp/
│   │   │   ├── controller/      # REST controllers
│   │   │   ├── exception/       # Custom exception handling
│   │   │   ├── model/           # Entity models
│   │   │   ├── repository/      # Database repository layer
│   │   │   ├── service/         # Business logic layer
│   │   │   └── TrainingCenterRegistryMvpApplication.java
│   │   ├── resources/
│   │   │   └── application.properties  # Database and app configuration
│   ├── test/
│── pom.xml  # Project dependencies
│── README.md  # Project documentation
```

## 🛠 Setup Instructions

### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/AkashBabar/TrainingCenter-Registry-MVP.git
cd TrainingCenter-Registry-MVP
```

### **2️⃣ Configure MySQL Database**
- Create a new MySQL database:
  ```sql
  CREATE DATABASE traini8_db;
  ```
- Update database credentials in **`src/main/resources/application.properties`**:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/traini8_db?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8
  spring.datasource.username=YOUR_USERNAME
  spring.datasource.password=YOUR_PASSWORD
  ```

### **3️⃣ Build and Run the Application**
```sh
mvn clean install
mvn spring-boot:run
```

### **4️⃣ API Endpoints**
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/training-centers` | Add a new training center |
| GET  | `/api/training-centers` | Get all training centers |

### **5️⃣ Sample Request Body**
```json
{
  "centerName": "Tech Training Hub",
  "centerCode": "TC1234567890",
  "city": "Pune",
  "state": "Maharashtra",
  "street": "XYZ Street",
  "zipCode": "411001",
  "contactEmail": "tech@training.com",
  "contactPhone": "9876543210",
  "studentCapacity": 150,
  "coursesOffered": ["Java", "Spring Boot", "React"]
}
```

## 🛠 Tools Used
- **Eclipse IDE** for development
- **Postman** for API testing
- **Git** for version control

## 🤝 Contributing
Feel free to submit a pull request if you find any improvements or issues.

---

Let me know if you need changes or additional details! 🚀

