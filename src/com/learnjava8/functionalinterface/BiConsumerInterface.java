package com.learnjava8.functionalinterface;
import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterface {
    static BiConsumer <String,List<String>> b1 = (name,activites) -> System.out.println("Name: " + name + ". Activities: " + activites);
    static List<Student> studentList = StudentDataBase.getAllStudents();
    static void printNameAndGrade(){
        studentList.forEach(curStudent -> b1.accept(curStudent.getName(),curStudent.getActivities())); // forEach Accepts consumer only not BiConsumer. Therefore we must use Lambda Expression in forEach loop
    }
    static void printNameifGradeLvlAbove2(){
        studentList.forEach(curStudent -> {
            if(curStudent.getGradeLevel() > 2) b1.accept(curStudent.getName(),curStudent.getActivities());
        });
    }


    public static void main(String[] args) {
        // it is an extension to Consumer Interface vaha bs ek type dete the yaha 2 type de sakte h. That's it.
        // andThen method 2 ya usse jyada consumer interface ko jod ke ek consumer ko form krta h. Better use BiConsumer Interface consumer1.addThen(consumer2) krne ke badle.
//        Bss aur khuch naya nhi isme
//
        BiConsumer<String,Integer> b1 = (s,i) -> System.out.println("Name: " + s + ". Age: " + i);
        b1.accept("Dv",21);
        System.out.println();
        printNameAndGrade();
        System.out.println();
        printNameifGradeLvlAbove2();
    }
}
//We can use Consumer and BiConsumer Interface. koi performace issue hoga