package com.Tests;

import com.geometric.AbstractTestGeometric;
import com.geometric.Triangle;
import com.point.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest extends AbstractTestGeometric {

    Point p1 = new Point(1.0,2.0,"Punkt A");
    Point p2 = new Point(1.0,8.0,"Punkt B");
    Point p3 = new Point(5.0,5.0,"Punkt C");
    Triangle testTriangle;

    @Override
    @Test
    public void calculateCircumference() {
        testTriangle = new Triangle(p1,p2,p3);
        double actualCircumferenceTriangle = testTriangle.getCircumference();
        assertEquals(16.0,actualCircumferenceTriangle, 0.1);
    }

    @Test
    @Override
    public void calculateArea() {
        testTriangle = new Triangle(p1,p2,p3);
        double actualAreaTriangle = testTriangle.getArea();
        assertEquals(12,actualAreaTriangle);
    }
}
