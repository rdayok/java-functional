package com.rdi.functionalinterface.consumers;

import com.rdi.Gender;
import com.rdi.Person;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {
        Person max = new Person("Max", Gender.MALE);
        greetPerson(max, true);

        // A biconsumer represents and operation that accepts a two input argument and returns no result
        greetPersonBiConsumer.accept(max, false );

    }

    public static BiConsumer<Person, Boolean> greetPersonBiConsumer = (person, showGender) ->
            System.out.println("Hello " + person.getName() + ", your gender is " +
                    (showGender ? person.getGender() : " not to be disclosed"));

    public static void greetPerson(Person person, boolean showGender) {
        System.out.println("Hello " + person.getName() + ", your gender is " +
                (showGender ? person.getGender() : " not to be disclosed"));
    }
}
