package com.learnjava8.constructorreference;

import com.learnjava8.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceEg {
    public static void main(String[] args) {
        Supplier<Student> newStudent = Student::new;
    // Note upar koi input parameter nhi h. Therefore, we must have a Default Constructor in that mentioned class. (here in Student Class).
        System.out.println(newStudent.get());

        Function<String,Student> newStu = Student::new; // Created a new object which takes
//  Note upar ek input parameter h. Therefore, we must have a parameterized constructor with one parameter in that mentioned class (here in Student Class).
        System.out.println(newStu.apply("champak"));
    
    }
}
