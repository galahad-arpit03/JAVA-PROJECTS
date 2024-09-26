package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.*;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    static Student[] students = new Student[5]; 

    public static void main(String[] args) {

        // Initializing sample data
        students[0] = new Student("Sekar", new int[]{85, 75, 95});
        students[1] = new Student(null, new int[]{11, 22, 33});
        students[2] = null; 
        students[3] = new Student("Manoj", null); 
        students[4] = new Student("Rahul", new int[]{50, 60, 80});

        StudentService studentService = new StudentService();
        StudentReport studentReport = new StudentReport();

        System.out.println("---- Validating and Reporting Grades ----");

        for (Student student : students) {
            try {
                String validation = studentService.validate(student);
                if ("VALID".equals(validation)) {
                    String grade = studentReport.findGrades(student);
                    System.out.println("Student: " + student.getName() + ", Grade: " + grade);
                }
            } catch (NullMarksArrayException e) {
                System.out.println("Exception: " + e.toString());
            } catch (NullNameException e) {
                System.out.println("Exception: " + e.toString());
            } catch (NullStudentObjectException e) {
                System.out.println("Exception: " + e.toString());
            }
        }

        System.out.println("\n---- Summary of Invalid Data ----");
        System.out.println("Number of null marks arrays: " + studentService.findNumberOfNullMarksArray(students));
        System.out.println("Number of null names: " + studentService.findNumberOfNullNames(students));
        System.out.println("Number of null student objects: " + studentService.findNumberOfNullObjects(students));
    }
}
