package com.learnjava8.streamapioperation;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FlatMap {

    public static void main(String[] args) {
//      With flatMap
        List<List<String>> studentActivities = StudentDataBase.getAllStudents().stream() // Stream of object
                .map(Student::getActivities) // Stream of list<String>
                .collect(toList());
        System.out.println(studentActivities);

//      With flatMap
        List<String> stuAct = StudentDataBase.getAllStudents().stream().
                map(Student::getActivities).
                flatMap(List::stream). // map se jo list nikala h uska bhi stream of String bana diya ( ye method reference ki tarah kiya h)
//        flatMap(stuActLi -> stuActLi.stream()). (lambda expression me is tarah)
                collect(toList());

        // is tarah bhi kr sakte
        List<String> stuAct1 = StudentDataBase.getAllStudents().stream().
                flatMap(student -> student.getActivities().stream()). // Function interface ne object liya and stream diya
                collect(toList());
//                flatMap(List::stream). // map se jo list nikala h uska bhi stream bana

        System.out.println(stuAct);
//                .flatMap(List::stream) // ussi list ko stream ko String me convert. Basically we flattened the nested list.
////                .flatMap(student -> student.getActivites())
    }
}
