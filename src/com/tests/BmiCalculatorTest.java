package com.tests;
import com.roman.BmiCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BmiCalculatorTest {

    BmiCalculator b = new BmiCalculator();

    @Test
    public void shouldMalnourished(){
        String returnText = b.calc(189, 55);
        assertEquals(returnText, "Untergewicht");
    }
    @Test
    public void shouldNormal(){
        String returnText = b.calc(180, 80);
        assertEquals(returnText, "Normalgewicht");
    }
    @Test
    public void shouldOverweight(){
        String returnText = b.calc(170, 80);
        assertEquals(returnText, "Uebergewicht");
    }
    @Test
    public void shouldObese(){
        String returnText = b.calc(170, 95);
        assertEquals(returnText, "Schweres Uebergewicht");
    }
}
