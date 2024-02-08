package com.learnjava8.optional;

import java.util.Optional;

public class OfNullableOfEmpty {
    public static void main(String[] args) {
                            // OfNullable()
        Optional<String> ofNullableEg = Optional.ofNullable("Hello"); // We can pass specified type and something which results to null.
//        Optional<String> ofNullableEg = Optional.ofNullable(null);
        System.out.println(ofNullableEg); // If Optional is null, returns Optional.empty

                            // of()
        Optional<Integer> of = Optional.of(3); // We can pass specified type only. Khuch null aaya to error.
//        Optional<Integer> of = Optional.of(null); // Not allowed
        System.out.println(of);

                            // empty()
        Optional<Double> empty = Optional.empty(); // returns empty object. Basically we can use it in exception block.
        System.out.println(empty);
    }
}
