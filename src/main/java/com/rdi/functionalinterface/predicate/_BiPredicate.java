package com.rdi.functionalinterface.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _BiPredicate {
    public static void main(String[] args) {
        // using the imperative style of java
        System.out.println(isNameSameLength("Retmax", "Dayok"));
        System.out.println(isNameSameLength("Jay", "May"));

        // A bipredicate is an operation that takes in two arguments and return a boolean
        System.out.println(isNameSameLengthBiPredicate.test("John", "Mama"));
        System.out.println(isNameSameLengthBiPredicate.test("Peter", "Pete"));

    }

    public static boolean isNameSameLength(String firstName, String secondName) {
        return firstName.length() == secondName.length();
    }

    public static BiPredicate<String, String> isNameSameLengthBiPredicate = (firstName, secondName) ->
            firstName.length() == secondName.length();

}
