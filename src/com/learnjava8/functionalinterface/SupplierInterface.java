package com.learnjava8.functionalinterface;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        // Supplier Interface is exactly opposite of Consumer Interface
//        It has no input type but returns a type
        Supplier<Integer> sum = () -> 5+6;
        System.out.println(sum.get());

        Supplier<Student> newStudent = () -> new Student("dj pappu",5,3,"male", Arrays.asList("khaana","khelna","sona")); // Input type diya Ek class to return karega koi object.
        System.out.println(newStudent.get());

        Supplier<List<Student>> studentList = () -> StudentDataBase.getAllStudents();
        System.out.println(studentList.get());
    }
}
