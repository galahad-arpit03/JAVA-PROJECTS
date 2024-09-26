package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentService {

    public String validate(Student s) throws NullMarksArrayException, NullNameException, NullStudentObjectException {
        if (s == null) {
            throw new NullStudentObjectException();
        } else {
            if (s.getName() == null) {
                throw new NullNameException();
            } else if (s.getMarks() == null) {
                throw new NullMarksArrayException();
            } else {
                return "VALID";
            }
        }
    }

    public int findNumberOfNullMarksArray(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student != null && student.getMarks() == null) {
                count++;
            }
        }
        return count;
    }

    public int findNumberOfNullNames(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student != null && student.getName() == null) {
                count++;
            }
        }
        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student == null) {
                count++;
            }
        }
        return count;
    }
}
