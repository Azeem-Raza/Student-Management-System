# Student-Management-System
# Introduction
This marks the culmination of the Java Server Programming Course – the final project involves a straightforward system for managing students and courses using Java Spring.

# Requirements
## a. Fundamental Requirements
The project will encompass a REST API designed for user authentication and the administration of student and course details. Exclusive access is granted to authorized users for the manipulation and addition of student and course information. Other users can see lists of students and courses, with the added capability to search based on ID.

## b. Additional Requirements


<img width="234" alt="image" src="https://github.com/Azeem-Raza/Student-Management-System/assets/83883981/6eee9d29-7682-417e-86b4-44d4f2f29853">



- Construct a user interface leveraging ReactJS.
- Implement user registration featuring a username and password.
- Adopt a Hash format for storing user passwords.





# Use Case Diagrams
## a. Authentication API
### Diagrams outlining use cases for authentication (Authentication Use Case Diagrams).

<img width="452" alt="image" src="https://github.com/Azeem-Raza/Student-Management-System/assets/83883981/c8183d31-5663-49e5-abe5-63ccc323b63d">


Users can register using a new username and password.
Users can log in by providing a username and password. 

## b. Student / Course API
### Diagram illustrating use cases for students and courses (Student and Course Use Case Diagram).

<img width="452" alt="image" src="https://github.com/Azeem-Raza/Student-Management-System/assets/83883981/c3c68843-71da-4e34-9f3d-10b4db078b00">


Any user can access information on courses and students.
Only authorized users possess the ability to modify course and student information, encompassing addition, modification, and deletion. Image.

# API Lists 
## a. StudentData API 
- GET /students: Retrieve a comprehensive list of all students.
- AUTH POST /students: Append a new student to the database (JSON in the request body).
- GET /students/{id}: Fetch a specific student by ID.
- AUTH DELETE /students/{id}: Erase a specific student by ID.

## b. Course API
- GET /courses: Retrieve a comprehensive list of all courses.
- AUTH POST /courses: Introduce a new course to the database (JSON in the request body).
- GET /courses/{id}: Obtain details on a specific course by ID (bonus: return a list of all students enrolled in this course).
- AUTH PUT /courses/{id}: Amend details of a specific course by ID.
- AUTH DELETE /students/{id}: Remove a specific course by ID.


# Usage
- **Users API**: Endpoint: /SMS/users; Methods: GET, POST, PUT, DELETE.
- **Students API**: Endpoint: /SMS/students; Methods: GET (No authentication), POST, DELETE (Requires authentication).
- **Courses API**: Endpoint: /SMS/courses; Methods: GET, POST, PUT, DELETE.
- **Authentication**: Endpoint: /login; Method: POST. Provide username and password.
  
# CourseList
<img width="1440" alt="Screenshot 2023-12-08 at 2 18 11" src="https://github.com/Azeem-Raza/Student-Management-System/assets/83883981/a8052c26-2f1d-47c6-80ea-aab373934fcc">

# StudentsList
<img width="1440" alt="Screenshot 2023-12-08 at 2 19 22" src="https://github.com/Azeem-Raza/Student-Management-System/assets/83883981/8c1215db-098d-4475-b070-3da014cc2d61">

# Search student by ID
<img width="1440" alt="Screenshot 2023-12-08 at 2 19 51" src="https://github.com/Azeem-Raza/Student-Management-System/assets/83883981/a2a4bed5-6e52-4540-8667-de40ce87c9ec">

#Login Page
<img width="1440" alt="Screenshot 2023-12-08 at 2 20 03" src="https://github.com/Azeem-Raza/Student-Management-System/assets/83883981/235d96e0-b163-4c60-9627-45d3e4982e59">


#User's Hased Password in DB

<img width="718" alt="Screenshot 2023-12-08 at 2 20 25" src="https://github.com/Azeem-Raza/Student-Management-System/assets/83883981/1f924948-36bb-4489-95a2-78fe6cc57eed">
