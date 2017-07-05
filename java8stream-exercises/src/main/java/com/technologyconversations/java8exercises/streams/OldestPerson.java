package com.technologyconversations.java8exercises.streams;

import static org.assertj.core.api.Assertions.setMaxElementsForPrinting;

import java.util.Comparator;
import static java.util.stream.Collectors.*;
import java.util.List;
import java.util.stream.Collectors;

public class OldestPerson {

    public static Person getOldestPerson7(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    public static Person getOldestPerson(List<Person> people) {
    	final Comparator<Person> comp = (p1, p2) -> Integer.compare( p1.getAge(), p2.getAge());
        Person oldest = people.stream()
                                  .max(comp)
                                  .get();

		return oldest;
    	
    }

}
