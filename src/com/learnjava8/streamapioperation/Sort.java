package com.learnjava8.streamapioperation;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        // sort() stream api operation without para and with 1 accepting para bhi hota h.

        List<Student> studentList = StudentDataBase.getAllStudents().stream().
                sorted(Comparator.comparing(Student::getName).reversed()). // Note: comparing method accepts function
//              sorted(Comparator.comparing(stu -> stu.getName()))
//        sorted(Comparator.comparing(Student::getName).reversed()). // descendig order me sort krne ke liye

                collect(Collectors.toList());

        studentList.forEach(System.out::println);


//        System.out.println(studentList);
//        studentList.forEach(stu -> System.out.println(stu));

    }
}
