package com.tests;

import com.roman.Person;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person1 = new Person("Koenig","Roman", 180,82,30);
    Person roman = new Person("Koenig","Roman", 180,82,30);
    Person person2 = new Person("Max","Mustermann", 175,80,43);

    //Gleiche Person

    //Falscher Test
    @Test
    public void testEqualNegative(){
        assertTrue(person1.equals(person2));
    }
    @Test
    public void testNotEqual(){
        assertFalse(person1.equals(person2));
    }
    @Test
    public void testEqual(){
        assertTrue(person1.equals(person1));
    }

    @Test
    public void testHash(){
        Map<Person, Integer> personToPhone = new HashMap<>();

        Person roman1 = new Person("Koenig","Roman", 180,82,30);
        Person roman = new Person("Koenig","Roman", 180,82,30);

        personToPhone.put(roman1, 42);
        personToPhone.put(roman, 1337);

        System.out.println(personToPhone.get(roman));
        System.out.println(personToPhone.get(roman1));

        assertNotEquals(personToPhone.get(roman).hashCode(), personToPhone.get(roman1).hashCode());

    }

    @Test
    public void testComporator(){

        Person roman = new Person("Koenig","Roman", 180,82,30);
        Person person1 = new Person("Koenig","Roman", 180,82,30);
        Person person2 = new Person("Max","Mustermann", 175,80,43);

        assertEquals(0, roman.compareTo(person1));
    }
}
