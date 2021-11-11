package com.tests;

import com.point.Vector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorTest {

    //Hier felder auf private setzen
    Vector a = new Vector(1.0, 2.0, 3.0, "Alpha");
    Vector b = new Vector(4.0,5.0,6.0,"Bravo");
    Vector d = new Vector(3.0,6.0,9.0, "Doof");
    Vector c;
    Double vectorLength;
    Double scalarProduct;
    Double scalar = 1.5;

    @Test
    public void testAddition(){
        c = a.add3dVector(a,b, "Charlie");
        assertEquals(5.0,c.getX());
        assertEquals(7.0,c.getY());
        assertEquals(9.0,c.getZ());
    }

    //Aus dem Coderview
    @Test
    public void testSubtraction(){
        c = Vector.subtract3dVector(a,b,"Delta");
        assertEquals(-3.0,c.getX());
        assertEquals(-3.0,c.getY());
        assertEquals(-3.0,c.getZ());
    }

    @Test
    public void testScalarProduct(){
        scalarProduct = a.scalarProduct(a,b);
        assertEquals(32.0, scalarProduct);
    }
    @Test
    public void testCrossProduct(){
        c = a.crossProduct(a, b, "Echo");
        assertEquals(-3.0,c.getX());
        assertEquals(6.0,c.getY());
        assertEquals(-3.0,c.getZ());
    }
    @Test
    public void testScalarMultiplication(){
        c = a.scalarMultiplication(a, scalar, "Foxtrot");
        assertEquals(1.5,c.getX());
        assertEquals(3,c.getY());
        assertEquals(4.5,c.getZ());
    }
    @Test
    public void testScalarDivision(){
        c = d.scalarDivision(d, scalar, "Foxtrot");
        assertEquals(2,c.getX());
        assertEquals(4,c.getY());
        assertEquals(6,c.getZ());
    }
    @Test
    public void testVectorLength(){
        vectorLength = a.getVectorLength(a);
        assertEquals(3.742,vectorLength,0.001);
    }
}
