package com.roman;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void shouldBeEven(){
        boolean isEven = Main.checkEvenNumber(4);
        assertTrue(isEven);
    }

    @Test
    public void shouldBeOdd(){
        boolean isOdd = Main.checkEvenNumber(5);
        assertFalse(isOdd);
    }

    //FailTest
    @Test
    public void expectOdd(){
        boolean isOdd = Main.checkEvenNumber(8);
        assertFalse(isOdd, "Ungerade Zahl wird erwartet. Eingabe ist eine gerade Zahl.");
    }
}
