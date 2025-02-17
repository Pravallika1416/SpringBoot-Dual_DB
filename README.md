Multi-Database Spring Boot Application

Overview

This project demonstrates how to integrate multiple databases in a Spring Boot application using JPA and Hibernate. The project utilizes Lombok for reducing boilerplate code and follows best practices for database transactions.

Features

Multiple database configurations

CRUD operations for different database entities

Lombok annotations for getter, setter, and toString methods

Spring Data JPA for database interaction



Technologies Used

Java 17+

Spring Boot 3+

Spring Data JPA

Hibernate

Lombok

MySQL/PostgreSQL (configurable)

Maven

IntelliJ IDEA (Recommended IDE)

Prerequisites

Ensure you have the following installed:

JDK 17+

Maven 3+

MySQL/PostgreSQL database

IntelliJ IDEA (or any other Java IDE)

Setup and Installation

1. Clone the repository

 git clone https://github.com/your-username/multi-db-spring-boot.git
 cd multi-db-spring-boot

2. Configure Databases

Edit application.yml to set up the database configurations:

spring:
  datasource:
    primary:
      url: jdbc:mysql://localhost:3306/primary_db
      username: root
      password: password
    secondary:
      url: jdbc:postgresql://localhost:5432/secondary_db
      username: postgres
      password: password
  jpa:
    properties:
      hibernate:
        dialect: org.hibernate.dialect.MySQL8Dialect
        ddl-auto: update

3. Enable Lombok Annotation Processing (IntelliJ IDEA)

Go to File → Settings → Build, Execution, Deployment → Compiler → Annotation Processors.

Check Enable annotation processing.

Click Apply and OK.

Rebuild the project.

4. Run the Application

 mvn spring-boot:run

Project Structure

multi-db-spring-boot/
│── src/main/java/org/learn/twodatabases/
│   ├── config/          # Database configurations
│   ├── entity/          # Entity classes (Person, Author, etc.)
│   ├── repository/      # JPA repositories
│   ├── service/         # Business logic
│   ├── controller/      # REST API controllers
│   ├── MultiDatabaseApplication.java  # Main entry point
│── src/main/resources/
│   ├── application.yml  # Database configuration
│── pom.xml              # Project dependencies

Lombok Annotations Used

@Getter and @Setter - Auto-generates getter and setter methods.

@ToString - Generates toString() method.

@AllArgsConstructor - Generates a constructor with all fields.

@NoArgsConstructor - Generates a default constructor.

@Data - Combines @Getter, @Setter, @ToString, @EqualsAndHashCode, and @RequiredArgsConstructor.

Sample Entity Class (Person)

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}

Running Tests

mvn test

Creating a New Branch in GitHub

git checkout -b feature/add-person-api

Contributing

Fork the repository.

Create a new feature branch (git checkout -b feature-branch).

Commit changes (git commit -m 'Add some feature').

Push to the branch (git push origin feature-branch).

Create a Pull Request.
