package com.learnjava8.streamapioperation;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.Optional;

public class Find {
    public static void main(String[] args) {
        Optional<Student> findAny = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.8)
                .findAny();

        Optional<Student> findFirst = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.8)
                .findFirst();

        System.out.println(findAny + "\n" +  findFirst);

    }
 }
