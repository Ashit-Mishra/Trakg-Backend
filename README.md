# Trakg Backend

Trakg is a Spring Boot based attendance tracking backend application built as a learning project to understand backend development using Java and the Spring ecosystem.

## Tech Stack

* Java 24
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven
* MySQL
* REST APIs

## Features Implemented

* Student Management

  * Create Student
  * View Students

* Subject Management

  * Create Subject
  * View Subjects

* Attendance Management

  * Create Attendance Records
  * View Attendance Records

* MySQL Database Integration

* JPA/Hibernate ORM Mapping

* REST API Architecture

## Project Structure

```text
controller/
service/
repository/
entity/
```

The project follows a layered architecture:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
MySQL Database
```

## Future Enhancements

### EduMarshal ERP Integration

A future version of Trakg will integrate with the AKGEC EduMarshal ERP system.

Planned features include:

* Fetching student attendance directly from EduMarshal APIs
* Automatic attendance synchronization
* Subject-wise attendance analytics
* Overall attendance percentage calculation
* Attendance history and trends
* Reduced manual data entry

The application is being designed so that attendance data can later be sourced from EduMarshal API endpoints instead of manual database updates.

## Learning Goals

This project is being developed to gain practical experience with:

* Spring Boot
* REST API Development
* JPA/Hibernate
* MySQL
* Backend Architecture
* API Integration
* Software Engineering Best Practices

## Status

🚧 Work in Progress

Currently focused on building the core backend functionality before integrating external ERP APIs.
