package com.learnjava8.lambdarestriction;

import java.util.function.Consumer;

public class LamdaRestriction {
    static int z = 6;
    public static void main(String[] args) {
        int i = 5;
//        Consumer<Integer> c = i -> System.out.println(i); // Error -> java: variable i is already defined in method main
//         Consumer<Integer> cs = j -> {
//             i =10; // Error dega
//             System.out.println(j);
//         };
//        cs.accept(34);
        Consumer<Integer> c = x -> {
            z++; // chalega
            System.out.println(i);
        };

    }
}
