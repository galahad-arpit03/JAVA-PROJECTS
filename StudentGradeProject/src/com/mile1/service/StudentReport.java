package com.mile1.service;

import com.mile1.bean.Student;

public class StudentReport {
    public String findGrades(Student student) {
        int sum = 0;
        for (int mark : student.getMarks()) {
            if (mark < 35) {
                student.setGrade("F");
                return "F";
            }
            sum += mark;
        }

        if (sum < 150) {
            student.setGrade("C");
            return "C";
        } else if (sum < 200) {
            student.setGrade("B");
            return "B";
        } else if (sum < 250) {
            student.setGrade("A");
            return "A";
        } else {
            student.setGrade("A+");
            return "A+";
        }
    }
}
