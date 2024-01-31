package com.learnjava8.numericstream;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class MapTo {
    public static List<Integer> mapToObj(){
        List<Integer> integerList = IntStream.rangeClosed(1,5)
                .mapToObj((i)-> {
                    return new Integer(i);
                })
                .collect(toList());
        return integerList;
    }

    public static double mapToDouble(){
        return   IntStream.rangeClosed(1,5)
                .mapToDouble((i) ->  i) // IntStream to DoubleStream
                .sum();
    }

    public static long mapToLong(){
        return   IntStream.rangeClosed(1,5)
                .mapToLong((i) ->  i) // IntStream to LongStream
                .sum();

    }
    public static void main(String[] args) {
        System.out.println("mapToObj : " + mapToObj());
        System.out.println("mapToDouble() : " + mapToDouble());
        System.out.println("mapToLong() : " + mapToLong());
    }
}
