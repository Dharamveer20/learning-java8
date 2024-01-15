package com.learnjava8.functionalinterface;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceExample {
    static Function<List<Student>, HashMap<String, Double>> fun1 = studentList -> {
        HashMap<String, Double> studentsNameAndGpa = new HashMap<>();
        studentList.forEach(curStudent -> {
            if (PredicateInterfaceExample.p1.test(curStudent)) {
                studentsNameAndGpa.put(curStudent.getName(),curStudent.getGpa());
            }
        });
        return studentsNameAndGpa;
    };

    public static void main(String[] args) {
        System.out.println(fun1.apply(StudentDataBase.getAllStudents()));
    }
}
