package com.tests;

import com.roman.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person1 = new Person("Koenig","Roman", 180,82,30);
    Person person2 = new Person("Max","Mustermann", 175,80,43);
    //Gleiche Person
    Person person3 = new Person("Koenig","Roman", 180,82,30);

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
        assertTrue(person1.equals(person3));
    }
}
