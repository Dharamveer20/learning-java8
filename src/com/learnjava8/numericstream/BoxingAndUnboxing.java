package com.learnjava8.numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1,25)
                    .boxed() //Stream<Integer> (Stream of wrapper class)
                    .collect(Collectors.toList());

            int sum =  integerList.stream()
                    .mapToInt(Integer::intValue) // returns IntStream of int primitive type
                    .sum();
        }
    }

