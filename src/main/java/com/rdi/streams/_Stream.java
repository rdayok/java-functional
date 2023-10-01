package com.rdi.streams;

import com.rdi.Person;

import java.util.List;
import java.util.stream.Collectors;

import static com.rdi.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Oyi", MALE),
                new Person("JayB", MALE),
                new Person("Nems", FEMALE),
                new Person("Leng", FEMALE),
                new Person("Snappy", MALE)
        );

        System.out.println("The list of distinct genders");
        people.stream()
                .map(Person::getGender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("The length of each name in the list");
        people.stream()
                .mapToInt(person -> person.getName().length())
                .forEach(System.out::println);

        System.out.println("Check if the list contains only females");
        boolean containsOnlyFemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.getGender()));
        System.out.println(containsOnlyFemales);

        System.out.println("Check if there is a PREFER_NOT_SAY gender");
        boolean noPreferredNotSayGender = people.stream()
                .noneMatch(person -> PREFER_NOT_SAY.equals(person.getGender()));
        System.out.println(noPreferredNotSayGender);

    }

}
