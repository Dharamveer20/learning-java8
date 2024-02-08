package com.learnjava8.optional;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.Optional;

public class FilterMapFlatMap {
    public static void main(String[] args) {
        Optional<Student> stuObj = Optional.ofNullable(StudentDataBase.studentSupplier.get()); // ek student object mil raha h bss
        if(stuObj.isPresent()) {
            Optional<String> naam = stuObj
                    .filter((stu) -> stu.getGpa() > 3.5) // filter karega stream ki tarah
                    .map(Student::getName); // map karega stream ki tarah

            naam.ifPresent((String) -> System.out.println(naam.get()));
        }
    }
}
