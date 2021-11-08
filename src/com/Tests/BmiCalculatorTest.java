package com.Tests;
import com.roman.BmiCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BmiCalculatorTest {

    // Muss statisch sein, wieso?
    @Test
    public void shouldMalnourished(){
        String returnText = BmiCalculator.calc(189, 55);
        assertEquals(returnText, "Untergewicht");
    }
    @Test
    public void shouldNormal(){
        String returnText = BmiCalculator.calc(180, 80);
        assertEquals(returnText, "Normalgewicht");
    }
    @Test
    public void shouldOverweight(){
        String returnText = BmiCalculator.calc(170, 80);
        assertEquals(returnText, "Uebergewicht");
    }
    @Test
    public void shouldObese(){
        String returnText = BmiCalculator.calc(170, 95);
        assertEquals(returnText, "Schweres Uebergewicht");
    }
}
