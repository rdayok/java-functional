package com.rdi.functionalinterface.predicate;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        // using the imperative style of java
        System.out.println(isPhoneNumberValid("0745983560"));
        System.out.println(isPhoneNumberValid("0954674335"));
        System.out.println(isPhoneNumberValid("079352345"));

        // A predicate is an operation that takes in an argument and return a boolean
        System.out.println(isPhoneNumberValidPredicate.test("0745983560"));
        System.out.println(isPhoneNumberValidPredicate.test("0954674335"));

        // We can chain predicates too
        System.out.println(isPhoneNumberValidPredicate.and(containsNumberFive).test("0745983564"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumberFive).test("07459835"));
    }

    public static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 10;
    }

    public static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 10;

    public static Predicate<String> containsNumberFive = phoneNumber ->
            phoneNumber.contains("5");
}
