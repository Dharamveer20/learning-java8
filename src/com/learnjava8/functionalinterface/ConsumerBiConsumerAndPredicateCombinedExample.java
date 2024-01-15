package com.learnjava8.functionalinterface;
import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerBiConsumerAndPredicateCombinedExample {
    static Predicate<Student> p1 = s -> s.getGradeLevel() > 2;
    static Predicate<Student> p2 = s -> s.getGpa() > 3.5;
    static BiPredicate<Integer,Double> bPre = (grade,gpa) -> grade > 2 && gpa > 3.5;
    static BiConsumer<String,List<String>> biconsumer = (name, activities)-> System.out.println("Name: " + name + ". Activities: " + activities);
    static Consumer<Student> consumer = s -> {
//        if(p1.and(p2).test(s)) biconsumer.accept(s.getName(),s.getActivities()); // with Predicate.
        if(bPre.test(s.getGradeLevel(),s.getGpa())) biconsumer.accept(s.getName(),s.getActivities()); // With the help of BiPredicate.
     };
     static void printDetails(List<Student> students){
         students.forEach(consumer);
     }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
//        new ConsumerBiConsumerAndPredicateCombinedExample().printDetails(studentList); // agar is tarah call kiya to upar saare static access specifier hata sakte h.
        printDetails(studentList);
    }
}
