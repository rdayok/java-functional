package com.rdi.functionalinterface.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _BiFunction {
    public static void main(String[] args) {
        System.out.println(incrementByOneAndMultiply(4, 50));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 50));
    }


    // The bifunction takes in two arguments and return a result. These two functions below are the same
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
    public static int incrementByOneAndMultiply(int number, int numberToMultiplyBy) {
        return (number + 1) * numberToMultiplyBy;
    }
}
