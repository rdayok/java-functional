package com.rdi;

import java.util.List;
import java.util.function.Predicate;

import static com.rdi.Gender.FEMALE;
import static com.rdi.Gender.MALE;

public class Declarative {
    public static void main(String[] args) {
        // Say we have a list of people
        List<Person> people = List.of(
                new Person("Oyi", MALE),
                new Person("JayB", MALE),
                new Person("Nems", FEMALE),
                new Person("Leng", FEMALE),
                new Person("Snappy", MALE)
        );

        System.out.println(" Declarative approach ");
        // Here is a declarative approach of achieving the same thing we did
        // imperatively where we first go through the list, pick the objects
        // we want to a list and final print these objects one after the other

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.getGender());
        List<Person> females = people.stream()
                .filter(personPredicate)
                .toList();
        females.forEach(System.out::println);

    }
}
