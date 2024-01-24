package com.learnjava8.streamapioperation;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class DistinctCountSorted {
    public static void main(String[] args) {
        List<String> stuAct = StudentDataBase.getAllStudents().stream().
                flatMap(stuActi -> stuActi.getActivities().stream()).
                distinct(). // Stream<String> -> with only distinct values
                sorted(). // Stream<String> ko sort kr dega
                collect(Collectors.toList());
        System.out.println(stuAct);

        long disActCount = StudentDataBase.getAllStudents().stream().
            flatMap(stu -> stu.getActivities().stream()).
            distinct(). // Stream<String> -> with only distinct values
            count();  // ye dega count
        System.out.println(disActCount);


    }
}
