# **SpringbBoot_FitnessTracker_backend**

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven
- PostgreSQL or any other preferred SQL database (i.ve used H2 db)

### Technologies Used

- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- Maven
- H2 database

### Setup

1. Clone the repository:

  ```bash
  git clone https://github.com/your-username/fitness_tracker.git
  cd fitness_tracker
```

2. Configure the database connection in src/main/resources/application.properties:
   ```bash
   spring.datasource.url=jdbc:postgresql://localhost:5432/your-database
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
   ```
3. Build and run the application:
 ```bash
mvn clean install
mvn spring-boot:run
```
4.The application should now be running on http://localhost:8080.
      
