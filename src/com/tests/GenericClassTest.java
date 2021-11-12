package com.tests;

import com.roman.GenericClass;
import com.roman.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GenericClassTest {

    Person person1 = new Person("Koenig","Roman", 180,82,30);
    Person person2 = new Person("Koenig","Roman", 180,82,30);

    GenericClass<Person> p = new GenericClass<>();
    List<Person> testList = new ArrayList<>();  //C

    @Test
    public void testCopy(){
        testList.add(person1);
        List<Person> newList = p.shallowCopy(person1); // D
// ---- Shallow Copy ----
//        d = copy.copy(c)
//
//        print id(c) == id(d)          # False - d is now a new object
//        print id(c[0]) == id(d[0])    # True - d[0] is the same object as c[0]
        assertFalse(testList == newList);
        assertTrue(testList.get(0) == newList.get(0));

    }
}
