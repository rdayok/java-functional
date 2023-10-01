package com.rdi.functionalinterface.function;

import java.util.function.Function;

public class ChainingFunctions {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);
        // Say we want to combine increment and multipleByFive functions to get a desired state
        Function<Integer, Integer> incrementAndMultiplyByFive = incrementByOneFunction.andThen(multiplyByFive);
        System.out.println(incrementAndMultiplyByFive.apply(1));
    }


    // The first Integer and second Integer the Function takes rep the
    // input and the return type respectively
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyByFive = number -> number * 5;

    public static int increment(int number) {
        return number + 1;
    }

}
