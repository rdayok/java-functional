package com.rdi.functionalinterface.consumers;

import com.rdi.Gender;
import com.rdi.Person;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Person max = new Person("Max", Gender.MALE);
        greetPerson(max);

        // A consumer represents and operation that accepts a single input argument and returns no result
        greetPersonConsumer.accept(max);

    }

     public static Consumer<Person> greetPersonConsumer = person ->
            System.out.println("Hello " + person.getName() + ", thanks for coming");

    public static void greetPerson(Person person) {
        System.out.println("Hello " + person.getName() + ", thanks for coming");
    }
}
