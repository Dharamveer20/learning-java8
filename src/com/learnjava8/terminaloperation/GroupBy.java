package com.learnjava8.terminaloperation;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

import static com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation.ANONYMOUS.optional;
import static java.util.stream.Collectors.*;

public class GroupBy {
    public static void main(String[] args) {
        Map<String, List<Student>> stuMapUsingGb  = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
//        System.out.println(stuMapUsingGb);

        Map<String, Integer> stuMapUsingGb1  = StudentDataBase.getAllStudents().stream()
//                .collect(groupingBy((student -> student.getGpa() > 3.8 ? "OutStanding" : "Average"),
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getGradeLevel)));

        Map<Integer,  Map<String,List<Student>>> studentMap =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa()>= 3.8 ?  "OUTSTANDING" : "AVERAGE")));
        System.out.println(stuMapUsingGb1 + "\n" +  studentMap);

    }
}
