package com.learnjava8.streamapioperation;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Student> stList = StudentDataBase.getAllStudents().stream()
                .filter(st -> st.getGender().equals("female")) // accepts Predicate interface
                .collect(Collectors.toList());

        stList.forEach(System.out::print);
    }
}
