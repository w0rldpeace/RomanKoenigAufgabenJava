package com.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.roman.LeastCommonMultiple;
import org.junit.jupiter.api.Test;

public class LeastCommonMultipleTest {

    LeastCommonMultiple l = new LeastCommonMultiple();

    @Test
    public void expectResult(){
        int result = l.calculateCommonMultiple(2,3);
        assertEquals(6,result);
    }

    //Negativer Test
    @Test
    public void expectCrash(){
        int result = l.calculateCommonMultiple(0,7);
        assertEquals(12, result);
    }
}
