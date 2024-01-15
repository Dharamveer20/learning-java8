package com.learnjava8.functionalinterface;

import java.util.function.Predicate;

public class PredicateInterface {
    // Consumer and BiConsumer Interface has no return type.
    // Predicate Interface ka return type is boolean.
    // It has "test" abstract method. Along with test it has default methods like "and","or","negate","isEqual" too.
    static Predicate<Integer> p = num1 -> num1 % 2 == 0;
    static Predicate<Integer> p1 = num2 -> num2 % 5 == 0;
    static void predicateAnd(){
        System.out.println(p.and(p1).test(12)); // false
        System.out.println(p.and(p1).test(10)); // true
    }
    static void predicateOr(){
        System.out.println(p.or(p1).test(12)); // true
        System.out.println(p.or(p1).test(9)); // false
    }
    static void predicateNegate(){
        System.out.println(p.or(p1).negate().test(12));// false
        System.out.println(p.or(p1).negate().test(9)); // true
    }

    public static void main(String[] args) {
//        Predicate<Integer> p = s -> {return s % 2 == 0;};
//        or
        Predicate<Integer> p = s -> s % 2 == 0;
        System.out.println(p.test(5)); // It has "test" abstract method.

        System.out.println("Predicate And");
        predicateAnd();

        System.out.println("Predicate Or");
        predicateOr();

        System.out.println("Predicate Negate");
        predicateNegate();
    }

}
