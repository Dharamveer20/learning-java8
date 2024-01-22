package com.learnjava8.streamapioperation;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamCode {
    public static void main(String[] args) {
        Predicate<Student> gradeGreaterEq3 = student -> student.getGradeLevel() >= 3;
        Predicate<Student> gpaGreaterEq3Dec9 = student -> student.getGpa() >= 3.9;
        Map<String,List<String>> studentNameAndActivities =
                StudentDataBase.getAllStudents().stream()
                .filter(gradeGreaterEq3)
                .filter(gpaGreaterEq3Dec9)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentNameAndActivities);
        List<String> studentName = Arrays.asList("Titu","Bitu","Pittu","Gittu");
        Stream<String> nameStream = studentName.stream();
        nameStream.forEach(System.out::println);
//        nameStream.forEach(System.out::println); // will throw error-> stream has already been operated upon or close
    }
}
