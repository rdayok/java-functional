package com.rdi.functionalinterface;

import java.util.function.Function;

public class _Fuction {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);
        int result = incrementByOneFunction.apply(5);
        System.out.println(result);
        // Note that the two functions below are no different
    }


    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    public static int increment(int number) {
        return number + 1;
    }


}

