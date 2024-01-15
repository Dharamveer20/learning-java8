package com.learnjava8.functionalinterface;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerInterface {
    static Consumer<Student> c1 = obj1 -> System.out.print("Student name: " + obj1.getName() + " ");
    static Consumer<Student> c2 = obj2 -> System.out.println(obj2);
    static Consumer<Student> c3 = obj3 -> System.out.println(obj3.getActivities());
//    static Consumer<Student> c4 = c1.andThen(c3);
    static List<Student> studentList = StudentDataBase.getAllStudents();
    static void printName(){
//        This interface is heavily used in forEach loop of a List which accepts a Consumer Interface. Note forEach loop has a for loop inside which calls accept for each object
        studentList.forEach(c1);
    }
    static void printDetails(){
        studentList.forEach(c2);
    }
    static void printNameAndActivities(){
        studentList.forEach(c1.andThen(c3)); // c1.andThen(c3) creates a new consumer. Also known as Consumer Chainig
    }
    static void printNameActivitiesDetail(){
        studentList.forEach(c1.andThen(c3).andThen(c2)); // We can combine multiple andThen to form a new consumer.
    }
    static void printParStudentDetails(){
        studentList.forEach(currStudent -> {
            if(currStudent.getGpa() > 3.6 && currStudent.getGradeLevel() > 2) c1.andThen(c3).accept(currStudent); // If used Lambda Expression in forEach, we need to call accept method explicitly .
        });
    }
    public static void main(String[] args) {
        // Consumer Interface code example. It has abstract method accept which accepts the input. This interface is heavily used in forEach loop of a List which accepts a Consumer Interface.
        Consumer<String> c = s -> System.out.println(s.toUpperCase());
        c.accept("Hey");
        System.out.println("\nName only below");
        printName();
        System.out.println("\nDetails only below");
        printDetails();
        System.out.println("\nName and activities below");
        printNameAndActivities();
        System.out.println("\nName and activities and detail below");
        printNameActivitiesDetail();
        System.out.println("\n with condition print details");
        printParStudentDetails();
    }
}