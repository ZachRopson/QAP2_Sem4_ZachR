# Golf Club Tournament Management API

## Project Overview
This project is a **Golf Club Tournament Management API** developed as part of QAP 2. It enables managing members and tournaments for a golf club, including adding members to tournaments, retrieving member and tournament details, and searching for specific data based on criteria. The application is built using **Java**, **Spring Boot**, **MySQL**, and **Docker**.

---

## Features
- Add and retrieve golf club members and tournaments.
- Search members by name or phone number.
- Search tournaments by date.
- Assign members to tournaments.
- Runs seamlessly in a Dockerized environment.

---

## Technologies Used
- **Java 17**
- **Spring Boot 3.4.0**
- **MySQL 8.4.3**
- **Docker** with Docker Compose
- **Postman** for API testing

---

## API Endpoints

### Members
- **Add a Member**  
  `POST /members`  
  Request Body Example:
  ```json
  {
    "name": "John Doe",
    "phone": "123-456-7890"
  }
Retrieve All Members
GET /members

Search Members by Name
GET /members/search?name=<name>

Tournaments
Add a Tournament
POST /tournaments
Request Body Example:

{
"name": "Spring Open",
"startDate": "2024-05-01",
"endDate": "2024-05-05"
}
Retrieve All Tournaments
GET /tournaments

Search Tournaments by Date
GET /tournaments/search?startDate=<YYYY-MM-DD>

Assign Members to Tournaments
Add a Member to a Tournament
POST /tournaments/{tournamentId}/members/{memberId}
Development Notes
This project demonstrates Git branching for collaborative development. Key branches include:

main: The primary branch containing stable, production-ready code.
feature/update-readme: Added this README to demonstrate branching.
feature/fix-docker: Addressed minor Docker configuration comments.
Branching evidence is included in the project repository. Use git log or git branch to view the branching structure.

Setup Instructions
Prerequisites
Docker installed and running.
Git installed.
Steps to Run
Clone the repository:

git clone https://github.com/ZachRopson/QAP2_Sem4_ZachR.git
cd QAP2_Sem4_ZachR
Start the Docker environment:

docker compose up
Access the API:

API runs on http://localhost:8080.
Test using Postman or curl:

Example request:

curl -X POST http://localhost:8080/members \
-H "Content-Type: application/json" \
-d '{"name": "John Doe", "phone": "123-456-7890"}'
Testing Evidence
Screenshots of Postman tests for:
Adding and retrieving members and tournaments.
Assigning members to tournaments.
Searching for members and tournaments.
Docker logs showing successful application and database startup.
Known Issues
No known issues.