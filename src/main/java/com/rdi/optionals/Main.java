package com.rdi.optionals;

import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "Default value");
        System.out.println(value);

        Object value2 = Optional.ofNullable("Hello Ret")
                .orElseGet(() -> "Default value");
        System.out.println(value2);

        Object value3 = Optional.ofNullable("Hello Ret")
                .orElseThrow(() -> new IllegalArgumentException("Bad argument"));

        Optional.ofNullable("Hello Ret")
                .ifPresent(passedValue -> {
                    System.out.println(passedValue.length());
                });

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending email to "+ email),
                        () -> {
                            System.out.println("Cannot send email");
                        });

        Optional.ofNullable("dayokr@gmail.com")
                .ifPresentOrElse(email -> System.out.println("Sent email to "+ email),
                        () -> {
                            System.out.println("Cannot send email");
                        });
    }
}
