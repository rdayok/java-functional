package com.rdi.finalexample;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("Ret", null, value ->
                System.out.println("last name is not provided for " + value));

        hello2("Oyi", null, () -> System.out.println("no last name was provided"));
    }

    public static void hello(String firstName, String lastName, Consumer<String> callBack) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        }else {
            callBack.accept(firstName);
        }
    }

    public static void hello2 (String firstName, String lastName, Runnable callBack) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        }else {
            callBack.run();
        }
    }
}
