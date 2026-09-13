# Flight Reservation System

A Java desktop application for managing airline reservations, flight bookings, employee operations, and customer account activities. The system is built using Java Swing and follows a simple GUI-based workflow for both passengers and employees.

<img width="1135" height="643" alt="{13E98264-226A-48D4-8E94-7301AC049E22}" src="https://github.com/user-attachments/assets/6eb76df8-c9b9-49b8-9f97-fbffc5f5fbd9" />


## Project Overview

This project allows users to:

- Create and manage passenger accounts
  
<img width="975" height="661" alt="{9E04FD45-655C-47C5-9E19-2A82A2A4A7F8}" src="https://github.com/user-attachments/assets/d1fce1d4-c460-4127-b30a-beb5afe7b59d" />

<img width="986" height="663" alt="{ED9C9F93-D6AB-4214-84A2-D9E4CF2087D9}" src="https://github.com/user-attachments/assets/fb40b415-a023-4ab4-b47e-f493853b2fea" />


  
- Log in as a passenger or employee
  
<img width="816" height="979" alt="{5F8993AA-578C-4DFE-8EA2-9955AC9BBB61}" src="https://github.com/user-attachments/assets/85e80ae7-93d9-4111-84b5-b3f871f8a0ec" />
  
- View available flights

<img width="1056" height="613" alt="{1FE1D43C-1FEB-4284-B8C7-7F4FC80EC4D0}" src="https://github.com/user-attachments/assets/09639af9-25e5-409a-910b-4564754f6726" />

  
- Reserve flights and manage booking details
  
<img width="575" height="500" alt="{5F32EFFC-6EF7-4C79-852C-7BEA3644D977}" src="https://github.com/user-attachments/assets/cbc93205-e22a-4aec-8b77-911a890fecbe" />



- Process payments for reservations
<img width="572" height="503" alt="{70CC97D6-50D8-456C-A1E2-E17581653A55}" src="https://github.com/user-attachments/assets/ff153683-cc09-42ad-b42e-faf1d932207e" />
<img width="578" height="500" alt="{B9342683-829A-4E8F-9018-FE39747F192A}" src="https://github.com/user-attachments/assets/d5aef264-2e6f-454d-b6ca-e1ba22c81d8c" />

- Review booking history

<img width="1055" height="612" alt="{8ECAA29B-412E-4980-A198-B2903A67779B}" src="https://github.com/user-attachments/assets/9da93576-400e-4548-ac0f-f50066c0ad9e" />

  
- Add flight feedback

<img width="1056" height="614" alt="{03B8690A-588A-422F-B938-4A1BBF6FA085}" src="https://github.com/user-attachments/assets/6b4351e8-bb9c-483e-b6b5-6804e20474a7" />

  
- Manage account and flight records from the employee side
  
<img width="628" height="552" alt="{67C01B56-CC57-478E-8FED-8ED77D87BAD4}" src="https://github.com/user-attachments/assets/64027859-972c-4fbe-8bfa-28c42e689489" />
<img width="635" height="690" alt="{D0FCC4DE-7A46-45FB-9ED8-D33DC3B5CFF6}" src="https://github.com/user-attachments/assets/0de01c7d-2160-4d14-930b-9e85430c10d0" />
<img width="669" height="502" alt="{0132FEE0-9656-43D6-ADA3-A8EA0500E1B6}" src="https://github.com/user-attachments/assets/8401e6e0-f012-48a3-9235-de86731e84fa" />


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
