package com.tests;

import com.roman.ArrayWrapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayWrapperTest {

    ArrayWrapper array = new ArrayWrapper(3);

//    @BeforeEach
//    public void setup(){
//        for(int i = 0; i < 4; i++){
//            array.add(i+1);
//        }
//    }
    @Test
    public void testAdd(){
        for(int i = 0; i < 3; i++){
            array.add(i+1);
        }
        assertEquals(3,array.getArraySize());
        assertEquals(3,array.getElementCount());
    }
    @Test
    public void testAddOfBounds(){
        assertEquals(6, array.getArraySize());
    }
    @Test
    public void testGetElement(){
        assertEquals(3, array.getElement(2));
    }

    @Test
    public void testElementCount(){
        assertEquals(4, array.getElementCount());
    }
}
