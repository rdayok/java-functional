package com.rdi.finalexample;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        Function<String, String> upperCaseName = name -> name.toUpperCase();
        Function<String, String> upperCaseName2 = name -> {
            if (name.isBlank()) throw new IllegalArgumentException("");
        return name.toUpperCase();
        };

        BiFunction<String, Integer, String> toUpperCase = (name, age) -> {
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Ret"));
        System.out.println(upperCaseName2.apply("Retnaa"));
        System.out.println(toUpperCase.apply("Maxwell", 20));
        System.out.println(upperCaseName2.apply(""));
    }
}
