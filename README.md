# Flight Reservation System

A Java desktop application for managing airline reservations, flight bookings, employee operations, and customer account activities. The system is built using Java Swing and follows a simple GUI-based workflow for both passengers and employees.
<img width="1135" height="643" alt="{13E98264-226A-48D4-8E94-7301AC049E22}" src="https://github.com/user-attachments/assets/8708817c-44fb-4865-a0c9-7449d1d24374" />

## Project Overview

This project allows users to:

- Create and manage passenger accounts
- Log in as a passenger or employee
- View available flights
- Reserve flights and manage booking details
- Process payments for reservations
- Review booking history
- Add flight feedback
- Manage account and flight records from the employee side

The application starts from the login screen and routes users based on their account type.

## Main Features

### Passenger Features

- Sign up for a new account
- Sign in securely
- View available flights
- Book a reservation
- Pay for tickets
- View reservation history
- Submit feedback

### Employee Features

- Manage flight records
- Add, update, or remove flights
- Manage passenger and employee accounts
- Review booking and payment records
- View customer feedback

## Project Structure

```text
Flight/
├── build.xml
├── manifest.mf
├── nbproject/
├── src/
│   ├── accounts.txt
│   ├── employees.txt
│   ├── feedbacks.txt
│   ├── flights.txt
│   ├── passengers.txt
│   ├── payments.txt
│   ├── people.txt
│   ├── reservations.txt
│   └── flight/
│       ├── Login_Frame.java
│       ├── SignUp_GUI.java
│       ├── Passenger_GUI.java
│       ├── Employee_GUI.java
│       ├── Flight.java
│       ├── Reservation.java
│       ├── Payment.java
│       ├── Access.java
│       └── ...
└── build/
```

## Technologies Used

- Java SE
- Swing GUI library
- NetBeans GUI Builder
- Ant build system

## Requirements

- Java JDK 8 or newer
- NetBeans IDE (recommended) or any Java IDE with Ant support
- A desktop environment for running the GUI app

## How to Run

### Option 1: Using NetBeans

1. Open the project folder in NetBeans.
2. Build the project.
3. Run the main class from the package `flight`.
4. The application will open on the login screen.

### Option 2: Using Command Line

From the project root (`Flight`), run:

```bash
ant run
```

If the project is already configured in your IDE, you can also run the application directly from the `Login_Frame` class.

## Entry Point

The application starts from the login screen in:

```text
src/flight/Login_Frame.java
```

## Data Storage

The system stores basic records in text files such as:

- accounts.txt
- employees.txt
- passengers.txt
- flights.txt
- reservations.txt
- payments.txt
- feedbacks.txt

These files are used as the project's local data source.

## Notes

This project is a simple academic or beginner-friendly reservation system and is suitable for learning GUI-based Java application design, class modeling, and file-based data storage.

## License

This project is provided for educational use and may be adapted for personal or academic projects.
