package com.learnjava8.numericstream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Ranges {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println(intStream.count()); // count returns no of elements in the stream.

        IntStream.range(1,50).forEach(curInt -> System.out.print(curInt + ", "));
        System.out.println();
        LongStream.range(1,50).forEach(curInt -> System.out.print(curInt + ", "));
        System.out.println();

        IntStream.rangeClosed(1,50).forEach(curInt -> System.out.print(curInt + ", "));
        System.out.println();
        LongStream.rangeClosed(1,50).forEach(curInt -> System.out.print(curInt + ", "));
        System.out.println();

        // We can use range and rangeClosed method for Double Stream too
        IntStream.range(1,49).asDoubleStream().forEach(curDouble -> System.out.print(curDouble + ", "));
    }
}
