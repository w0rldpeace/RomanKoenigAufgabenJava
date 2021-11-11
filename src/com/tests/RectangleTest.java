package com.tests;

import com.geometric.AbstractGeometricTest;
import com.geometric.Rectangle;
import com.point.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest extends AbstractGeometricTest {
    Point p1 = new Point(1.0,2.0,"Punkt A");
    Point p2 = new Point(1.0,8.0,"Punkt B");
    Point p3 = new Point(5.0,8.0,"Punkt C");
    Point p4 = new Point(5.0,2.0,"Punkt D");

    Rectangle testRectangle;

    @Override
    @Test
    public void calculateCircumference() {
        testRectangle = new Rectangle(p1,p2,p3,p4);
        double actualCircumferenceRectangle = testRectangle.getCircumference();
        assertEquals(20.0,actualCircumferenceRectangle);
    }

    @Override
    public void calculateArea() {
        testRectangle = new Rectangle(p1,p2,p3,p4);
        double actualAreaRectangle = testRectangle.getArea();
        assertEquals(28.0,actualAreaRectangle);
    }
}
