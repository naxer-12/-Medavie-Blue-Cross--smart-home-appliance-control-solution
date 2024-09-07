# -Medavie-Blue-Cross--smart-home-appliance-control-solution
Smart Home Appliance Control System
This project is a Spring Boot-based solution for controlling home appliances such as a Light, Fan, and Air Conditioner. Each appliance has unique on/off mechanisms, and the system automatically performs an annual update on January 1st at 1:00 AM, turning off all appliances during the update.

Features:
  REST API for controlling appliances.
  Scheduled task for automatic annual updates.
  Supports appliance control logic for Light, Fan, and Air Conditioner.
  Built using Spring Boot with dependency injection and scheduling.
  Unit tests are written using JUnit and Mockito.
How to Run:
  Clone the repository.
  Run the application using mvn spring-boot:run.
  Access the REST API at http://localhost:8080/turnOffAll to turn off all appliances.
