package com.learnjava8.terminaloperation;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class SumAndAvg {
    public static void main(String[] args) {
        int sumOfGrade = StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getGradeLevel));

        double avgOfGrade = StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getGradeLevel));

        System.out.println(sumOfGrade + " " + avgOfGrade);
    }
}
