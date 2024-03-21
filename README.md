# Flight Reservation System

This project is a flight reservation system developed using Spring Boot and JSP (JavaServer Pages). It provides functionalities for users to search for flights, make reservations, manage bookings, and administer the system.

## Features

### Flight Search
- Users can search for flights based on various criteria such as departure city, destination city, departure date, and number of passengers.
- The system provides real-time availability and pricing information for available flights.

### Reservation
- Users can reserve flights by providing passenger details and selecting available flights from the search results.
- The reservation process includes validation to ensure accuracy of passenger information and flight selection.

### Booking Management
- Administrators can manage flight bookings, including viewing, updating, and canceling reservations.
- Booking management functionalities are secured with appropriate access control to prevent unauthorized access.

### Flight Administration
- Administrators can administer flight-related information such as adding new flights, updating flight schedules, and managing seat availability.
- Flight administration functionalities are accessible only to authorized administrators with appropriate privileges.

## Technologies Used

- Spring Boot: Provides a framework for building and deploying Spring-based applications.
- JavaServer Pages (JSP): Used for creating dynamic web pages to render flight search results, reservation forms, and booking management interfaces.
- Spring Security: Ensures secure authentication and authorization for accessing system functionalities.
- Hibernate: Provides ORM (Object-Relational Mapping) capabilities for interacting with the database.
- MySQL: Used as the backend database for storing flight and reservation data.
- Maven: Manages project dependencies and facilitates project build and packaging.

## Getting Started

To run the Flight Reservation System locally, follow these steps:

1. Clone the repository to your local machine:
