package com.learnjava8.optional;
import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.Optional;

public class OrElseOrElseGetOrElseThrow {
    public static void main(String[] args) {
//        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        // orElse -> ye krdo varna orElse waala part. Note: orElse accepts primitive value
        String name = student.map(Student::getName).orElse("No name");
        System.out.println(name);

        // orElseGet -> ye krdo varna orElseGet waala part. Note: orElseGet accepts supplier
        String name2 = student.map(Student::getName).orElseGet(() -> "No name");
        System.out.println(name2);

        // orElseThrow -> ye krdo varna orElseThrow waala exception throw krdo . Note: orElseGet accepts primitive value
        String name3 = student.map(Student::getName).orElseThrow(() -> new RuntimeException("No data for name"));
        System.out.println(name3);
    }
}
