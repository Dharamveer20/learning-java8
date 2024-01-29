package com.learnjava8.numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamEg {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        int sum = integerList.stream() // Stream<Integer>
                .reduce(0,(x,y)->x+y); // unboxing to convert Integer to an int.

        int sum1 = IntStream.rangeClosed(1,6) // range closed takes beginning and ending index and returns stream to stream banane ki jarurat nhi.
                .sum(); //saves the unboxing effort
    }
}
