package com.rdi.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static com.rdi.combinatorpattern.ValidationResult.*;

public interface CustomerValidationServiceCombinator extends Function<Customer, ValidationResult> {
    static CustomerValidationServiceCombinator iEmailValid (){
        return customer -> customer.getEmail().contains("@") ?
                SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerValidationServiceCombinator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().startsWith("+0") ?
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerValidationServiceCombinator isAdult() {
        return customer -> Period.between(customer.getDateOfBirth(), LocalDate.now()).getYears() > 18 ?
                SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerValidationServiceCombinator and(CustomerValidationServiceCombinator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }

}
