package com.learnjava8.functionalinterface;

import java.util.function.Function;

public class FunctionInterface {
    static Function<String,String> fun1 = s -> s.toUpperCase();
    static Function<String,String> fun2 = s -> s.concat("dj");
    static void display(){
        System.out.println(fun1.andThen(fun2).apply("Babban")); // Ouput -> BABBANdj. It says -> fun1 ko "Babban" do and then jo ouput aaye vo output fun2 ko do. Isko apn Function chaining bol sakte h.
        System.out.println(fun2.andThen(fun1).apply("Babban")); // Ouput -> BABBANDJ. It says -> fun2 ko "Babban" do and then jo ouput aaye vo output fun1 ko do.
        // ye second waala can also be done using compose default method.
        System.out.println(fun1.compose(fun2).apply("Babban")); // Ouput -> BABBANDJ. It says -> fun2 ko "Babban" do and then jo ouput aaye vo output fun1 ko do.
//        Aise hi multiple andThen and compose chain kr sakte h Eg. fun1.addThen(fun2).compose(fun3).addThen(fun4).apply("Chipkali" n);
    }
    public static void main(String[] args) {
        // Consider it as function which input/accepts 1 para of desired type and return same or another type. The types are mentioned between <> braces. Type 1: input para. Type 2: output para.
        // There also exists BiFunctional Interface which accepts 2 input parameters and returns 3rd type.Eg, Function<type1,type2,type3) = fun -> (type1Name,type2Name) -> {};. bss itna hi hai
        Function<String,Integer> fun1 = s -> s.length();
        System.out.println(fun1.apply("Mikasa"));
        display();
    }
}
