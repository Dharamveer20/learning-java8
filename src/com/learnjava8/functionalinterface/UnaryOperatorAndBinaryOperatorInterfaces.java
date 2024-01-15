package com.learnjava8.functionalinterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorAndBinaryOperatorInterfaces {
    // UnaryOperator -> It extends the Function Interface. Khuch alg nhi h. Bss the input type and return type are same here.
//        So if known that return type is same as input type, better use UnaryOperator Interface. baaki sb same as Functional Interface.
    static UnaryOperator<String> u1 = s -> s.toUpperCase(); // return type bhi String

    // BinaryOperator -> It extends the BiFunction Interface. Khuch alg nhi h. Bss dono input +  return sabke type same.
//        So if known that return type is same as input type, better use UnaryOperator Interface. baaki sb same as Functional Interface.
    static BinaryOperator<Integer>  b1 = (num1,num2) -> num1*num2; // dono input para + return type bhi Integer.
//    BinaryOperator also has maxBy and minBy method which accepts comparator which returns max and min value between 2 integer respectively.
     static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
    static void comUsingBinOp() {
        BinaryOperator<Integer> b2 = BinaryOperator.maxBy(comparator); // maxBy and minBy are static method present in this interface and static methods ko class.methodName se call kr sakte h yaad rakh.
        System.out.println(b2.apply(5, 6));

        BinaryOperator<Integer> b3 = BinaryOperator.minBy(comparator);
        System.out.println(b3.apply(5, 6));
    }

    public static void main(String[] args) {
        System.out.println(u1.apply("Naidu"));
        System.out.println(b1.apply(5,6));
        comUsingBinOp();
    }
}
