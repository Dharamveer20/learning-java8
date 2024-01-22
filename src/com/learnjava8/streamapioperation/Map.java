package com.learnjava8.streamapioperation;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class Map {
    public static void main(String[] args) {
       Set<String> studentName =  StudentDataBase.getAllStudents().stream() // Created stream of Student
                .map(Student::getName) // Converted Stream of Student to Stream of String
                .collect(toSet()); // created Set.

        System.out.println(studentName);
    }
}
