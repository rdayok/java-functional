package com.rdi;

import java.util.ArrayList;
import java.util.List;

import static com.rdi.Gender.FEMALE;
import static com.rdi.Gender.MALE;

// An imperative approach of programming

public class Imperative {
    public static void main(String[] args) {
        // Say we have a list of people
        List<Person> people = List.of(
                new Person("Oyi", MALE),
                new Person("JayB", MALE),
                new Person("Nems", FEMALE),
                new Person("Leng", FEMALE),
                new Person("Snappy", MALE)
        );

        // Imperative approach of finding out how many females we have
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if(FEMALE.equals(person.getGender())){
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        // This is an approach that we define every little details of
        // what we want to do

    }
}
