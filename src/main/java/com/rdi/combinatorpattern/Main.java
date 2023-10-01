package com.rdi.combinatorpattern;

import java.time.LocalDate;

import static com.rdi.combinatorpattern.CustomerValidationServiceCombinator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "John",
                "john21@yahoo.com",
                "  05635475",
                LocalDate.of(2001, 2, 12)
        );


        System.out.println(new CustomerValidatorService().isValid(customer));
        // If customer is valid we then go ahead to store in db
        ValidationResult result = iEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if (!result.equals(ValidationResult.SUCCESS))
            throw new IllegalStateException(result.name());
    }


}
