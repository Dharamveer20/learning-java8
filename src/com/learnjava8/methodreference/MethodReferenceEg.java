package com.learnjava8.methodreference;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceEg {
    public static void main(String[] args) {
//         In Functional Interface
//         Using Lambda Expression
        Function<String,String> usingLambda = word -> word.toUpperCase();
        System.out.println(usingLambda.apply("AadaPadaKonPada"));

        // Using Method Reference
        Function<String,String> usingMethodReference = String::toUpperCase;
        System.out.println(usingMethodReference.apply("bantiWedsBabli"));

        // In Consumer Interface
        List<Student> studentList = StudentDataBase.getAllStudents();
        // Using Lambda Expression
        Consumer<Student> usingLambda1 = curStudent -> System.out.println(curStudent);
        studentList.forEach(usingLambda1);

        // Using Method Reference
        Consumer<Student> usingMethodReference1 = System.out::println;
        studentList.forEach(usingMethodReference1);

        Consumer<Student> usingLambda2 = curStudent -> curStudent.printActivities();
        studentList.forEach(usingLambda2);

        Consumer<Student> usingMethodReference2 = Student::printActivities;
        studentList.forEach(usingMethodReference2);


    }
}
