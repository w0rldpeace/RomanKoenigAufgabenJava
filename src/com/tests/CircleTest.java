package com.tests;

import com.geometric.AbstractGeometricTest;
import com.geometric.Circle;
import com.point.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest extends AbstractGeometricTest {

    Point testCenterPoint = new Point(2.0,2.0,"Center Point");
    Circle testCircle;

    @Override
    @Test
    public void calculateCircumference() {
        testCircle = new Circle(testCenterPoint, 4.5);
        double actualCircumference = testCircle.getCircumference();
        assertEquals(28.27,actualCircumference, 0.01);
    }

    @Override
    @Test
    public void calculateArea() {
        testCircle = new Circle(testCenterPoint, 4.5);
        double actualArea = testCircle.getArea();
        assertEquals(63.61,actualArea,0.01);

    }
}
