package com.tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.point.Point;
import org.junit.jupiter.api.Test;

public class PointTest {

    Point a = new Point(8.0,4.0, "Alpha");
    Point b = new Point(2.0,2.0,"Bravo");
    Point c;

    @Test
    public void testAddition(){
        c = a.addCoordinates(a, b, "Charlie");
        assertEquals(10.0, c.getX());
        assertEquals(6.0, c.getY());
    }
    @Test
    public void testSubtraction(){
        c = a.subtractCoordinates(a,b,"Delta");
        assertEquals(6.0, c.getX());
        assertEquals(2.0, c.getY());
    }
    @Test
    public void testMultiplication(){
        c = a.multiplyCoordinates(a, b, "Echo");
        assertEquals(16.0, c.getX());
        assertEquals(8.0, c.getY());
    }
    @Test
    public void testDivision(){
        c = a.divideCoordinates(a, b, "Foxtrot");
        assertEquals(4.0, c.getX());
        assertEquals(2.0, c.getY());
    }
}
