package com.learnjava8.functionalinterface;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceExample {
    static List<Student> studentList = StudentDataBase.getAllStudents();
    static Predicate<Student> p1 = s -> s.getGradeLevel() > 2;
    static Predicate<Student> p2 = s -> s.getGpa() > 3.5;

    static void printStuDetailBasedOnGrade(){
        studentList.forEach(curStudent -> {
            if(p1.test(curStudent)) System.out.println(curStudent);
        });
    }
    static void printStuDetailBasedOnGradeAndGpa(){
        studentList.forEach(curStudent -> {
           if(p1.and(p2).test(curStudent)) System.out.println(curStudent);
        });
    }
    public static void main(String[] args) {
        printStuDetailBasedOnGrade();
        System.out.println();
        printStuDetailBasedOnGradeAndGpa();
    }
}
// Basically we can use Predicate Interface for conditions.