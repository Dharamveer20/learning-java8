package com.learnjava8.streamapioperation;

import com.learnjava8.data.StudentDataBase;

public class Match {
    public static void main(String[] args) {
        boolean a = StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() > 3);

        boolean b = StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() > 3);

        boolean c = StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() > 3);

        System.out.println(a + " " + b + " " + c);

    }
}
