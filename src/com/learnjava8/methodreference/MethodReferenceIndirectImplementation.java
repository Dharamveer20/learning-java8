package com.learnjava8.methodreference;

import com.learnjava8.data.Student;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceIndirectImplementation {
    // Implementing Method Reference where it cannot be directly implemented
    static Supplier<Student> studentSupplier = () -> new Student("bimlesh",3,4.4,"male", Arrays.asList("kirket", "tebal tanis","fud"));



    // We cannot directly create method reference for Predicate Interface. But we can create boolean method and use it.
    // Using Lambda Expression
    static Predicate<Student> usingLamda = student -> student.getGpa() > 3;

    // Using Method Reference Expression
    static boolean gpaGreater3 (Student s){
        return s.getGpa() > 3;
    }
    static Predicate<Student> usingMethodReference = MethodReferenceIndirectImplementation::gpaGreater3;

    public static void main(String[] args) {
        System.out.println(usingLamda.test(studentSupplier.get()));
        System.out.println(usingMethodReference.test(studentSupplier.get()));
    }
}
