# Student Grade Validation & Reporting System

## Project Overview

The **Student Grade Validation & Reporting System** is a Java-based application designed to handle student data, validate input, calculate grades, and manage exceptions related to null or invalid data. The project demonstrates key Object-Oriented Programming (OOP) principles and introduces custom exceptions for error handling.

---

## Features

- **Student Data Validation**: Validates student objects, checking for null names, null marks arrays, and null student objects.
- **Custom Exception Handling**: Uses custom exceptions to handle invalid data:
  - `NullStudentObjectException`
  - `NullNameException`
  - `NullMarksArrayException`
- **Grade Calculation**: Calculates student grades based on their marks:
  - A+ : Marks >= 90
  - A  : 80 <= Marks < 90
  - B  : 70 <= Marks < 80
  - C  : 60 <= Marks < 70
  - F  : Marks < 60
- **Data Reporting**: Provides a summary report of invalid data including counts of:
  - Null student objects
  - Null names
  - Null marks arrays

---

## Project Structure

1. **StudentMain.java**: The main entry point of the application that initializes student data, calls validation methods, and generates grades.
2. **StudentService.java**: Contains methods for validating student data and counting invalid data entries.
3. **StudentReport.java**: Responsible for calculating grades and generating a report.
4. **Custom Exceptions**:
   - `NullStudentObjectException`
   - `NullNameException`
   - `NullMarksArrayException`

---

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or later
- Integrated Development Environment (IDE) like Eclipse or IntelliJ IDEA

### Steps to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/galahad-arpit03/JAVA-PROJECTS/blob/main/StudentGradeProject.git
Open the project in your preferred IDE.
Compile and run the StudentMain class.
Sample Data
The project includes a set of sample student objects, some of which contain invalid data for testing purposes:

java
Copy code
Student[] data = new Student[4];
data[0] = new Student("Sekar", new int[]{85, 75, 95});
data[1] = new Student(null, new int[]{11, 22, 33});  // Null name
data[2] = null;                                      // Null object
data[3] = new Student("Manoj", null);                // Null marks array
Custom Exceptions
The project uses the following custom exceptions to handle invalid student data:

NullStudentObjectException: Thrown when a student object is null.
NullNameException: Thrown when a student's name is null.
NullMarksArrayException: Thrown when a student's marks array is null.
