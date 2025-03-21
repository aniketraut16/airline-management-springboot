# Airline Management System API

This is a Spring Boot-based Airline Management System that allows users to manage flight details and book/cancel tickets.

## 🛠 Tech Stack

- **Spring Boot** (Backend)
- **Java** (Programming Language)
- **REST API** (HTTP-based communication)
- **In-Memory Data Storage** (Using HashMaps for simplicity)

## 📌 Features

- Fetch all available flights
- Get flight details by ID
- Get flight schedules
- Book a ticket
- Retrieve ticket details
- Cancel a ticket

## 🚀 API Endpoints

### **1️⃣ Flights API**

#### **Get all flights**

- **Endpoint:** `GET http://localhost:9056/flights`
- **Response:**

```json
[
  {
    "id": 1,
    "airline": "Emirates",
    "source": "Dubai",
    "destination": "New York",
    "schedules": []
  },
  {
    "id": 2,
    "airline": "Qatar Airways",
    "source": "Doha",
    "destination": "London",
    "schedules": []
  },
  {
    "id": 3,
    "airline": "Singapore Airlines",
    "source": "Singapore",
    "destination": "Tokyo",
    "schedules": []
  },
  {
    "id": 4,
    "airline": "Lufthansa",
    "source": "Frankfurt",
    "destination": "Toronto",
    "schedules": []
  },
  {
    "id": 5,
    "airline": "Turkish Airlines",
    "source": "Istanbul",
    "destination": "Paris",
    "schedules": []
  },
  {
    "id": 6,
    "airline": "British Airways",
    "source": "London",
    "destination": "Los Angeles",
    "schedules": []
  },
  {
    "id": 7,
    "airline": "Etihad Airways",
    "source": "Abu Dhabi",
    "destination": "Sydney",
    "schedules": []
  }
]
```

#### **Get flight details by ID**

- **Endpoint:** `GET http://localhost:9056/flights/:id`
- **Response:**

```json
 {
    "id": 1,
    "airline": "Emirates",
    "source": "Dubai",
    "destination": "New York",
    "schedules": []
  },
```

#### **Get flight schedules**

- **Endpoint:** `GET http://localhost:9056/flights/:id/schedules`
- **Response:**

```json
[
  {
    "id": 201,
    "flightId": 1,
    "date": "2025-04-10",
    "departureTime": "08:00:00",
    "arrivalTime": "16:30:00",
    "availableSeats": 70
  },
  {
    "id": 202,
    "flightId": 1,
    "date": "2025-04-11",
    "departureTime": "14:00:00",
    "arrivalTime": "22:30:00",
    "availableSeats": 50
  }
]
```

---

### **2️⃣ Ticket API**

#### **Book a ticket**

- **Endpoint:** `POST http://localhost:9056/ticket`
- **Request Body:**

```json
{
  "flightId": 1,
  "travelDate": "2025-03-26",
  "passengerName": "Aniket Raut"
}
```

- **Response:**

```json
{
  "message": "Ticket booked successfully!",
  "bookingReference": "REF-1234ABCD"
}
```

#### **Get ticket details**

- **Endpoint:** `GET http://localhost:9056/ticket/:id`
- **Response:**

```json
{
  "id": 101,
  "flightId": 1,
  "travelDate": "2025-03-26",
  "passengerName": "Aniket Raut",
  "bookingReference": "REF-1234ABCD"
}
```

#### **Cancel a ticket**

- **Endpoint:** `DELETE http://localhost:9056/ticket/:id`
- **Response (Success):**

```json
{
  "message": "Ticket Canceled Successfully!"
}
```

- **Response (Invalid ID):**

```json
{
  "message": "Invalid Ticket ID"
}
```

## 🏃‍♂️ Running the Application

1. Clone the repository:
   ```sh
   git clone https://github.com/aniketraut16/airline-management.git
   ```
2. Navigate to the project directory:
   ```sh
   cd airline-management
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```
4. The server will start at `http://localhost:9056`
