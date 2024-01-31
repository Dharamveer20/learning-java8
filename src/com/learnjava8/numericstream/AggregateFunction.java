package com.learnjava8.numericstream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;

public class AggregateFunction {
    public static void main(String[] args) {
        OptionalInt min = IntStream.rangeClosed(1,40).min(); // O/p -> 1
        OptionalInt max = IntStream.rangeClosed(1,40).max(); // max and min returns OptionalDouble // O/p -> 40
        OptionalDouble average = IntStream.rangeClosed(1,40).average(); // average returns OptionalDouble // O/p -> 20.5
        long countElInStream = IntStream.rangeClosed(1,40).count(); // count returns long // O/p ->  40

        System.out.println(min.isPresent() ? min.getAsInt() : "no stream");
        System.out.println(max.getAsInt() + " " + average.getAsDouble() + " " + countElInStream);
    }
}
