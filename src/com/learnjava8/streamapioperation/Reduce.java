package com.learnjava8.streamapioperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 3, 5, 7);
        // for 2 para
        int multi = intList.stream()
                .reduce(1, (a, b) -> a * b);
        // Here first 'a' is set to default value 1 and multiplied with 'b' = 1 (b = 1 from stream) -> result = 1
        // 'a' is set to previous output 'b' = 3 (b = 3 from stream)-> result = 3
        // 'a' = 3 'b' = 5 (from stream) -> result = 15
        // 'a' = 15 'b' = 7 (from stream) -> result = 105

        System.out.println(multi);

        // For 1 para
        Optional<Integer> multi1 = intList.stream()
                .reduce((a, b) -> a * b);

            System.out.println(multi1.get()); // .get() returns the output of an optional
        if(multi1.isPresent()) System.out.println(multi1.get()); // isPresent() -> returns true if result is present
    }
}
