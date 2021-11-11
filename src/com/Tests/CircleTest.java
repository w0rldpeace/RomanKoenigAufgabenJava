package com.Tests;

import com.geometric.AbstractTestGeometric;
import com.geometric.Circle;
import com.point.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest extends AbstractTestGeometric {

    Point testCenterPoint = new Point(2.0,2.0,"Center Point");
    Circle testCircle;

    @Override
    @Test
    public void calculateCircumference() {
        testCircle = new Circle(testCenterPoint, 2);
        double actualCircumference = testCircle.getCircumference();
        assertEquals(12.56,actualCircumference, 0.01);
    }

    @Override
    @Test
    public void calculateArea() {
        testCircle = new Circle(testCenterPoint, 2);
        double actualArea = testCircle.getArea();
        assertEquals(12.56,actualArea,0.01);

    }
}
