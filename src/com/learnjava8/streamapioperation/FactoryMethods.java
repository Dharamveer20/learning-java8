package com.learnjava8.streamapioperation;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FactoryMethods {
    public static void main(String[] args) {
        // of()
        Stream<String> nameStream = Stream.of("Antu","Bntu","Cntu","Dntu"); // created a stream of string
        nameStream.forEach(System.out::println);
            // OR
//        Stream.of("Antu","Bntu","Cntu","Dntu")
//                .forEach(System.out::println);
        // iterate()
        Stream.iterate(1, a -> a*2) // accepts initial value and Unary Operator (ye infinite stream banata jayega)
                .limit(10) // limit se apn bolre bhai 10 se jyada mt chale jana.
                .forEach(System.out::println);
        // generate
        Supplier<Integer> generateRan = new Random()::nextInt;
        Stream.generate(generateRan) // accepts supplier and infinte stream banata jayega agr limit set nhi kiya to
                .limit(10)
                .forEach(System.out::println);
    }
}
