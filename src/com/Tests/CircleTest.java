package com.Tests;

import com.geometric.AbstractTestGeometric;
import com.geometric.Circle;
import com.point.Point;
import org.junit.jupiter.api.Test;

public class CircleTest extends AbstractTestGeometric {

    Point testCenterPoint = new Point(2.0,2.0,"Center Point");
    Circle testCircle;

    @Override
    @Test
    public void calculateCircumference() {
        testCircle = new Circle(testCenterPoint, 2.0);
        double actualCircumferenceCircle = testCircle.circumferenceCircle(testCircle);
    }

    @Override
    @Test
    public void calculateArea() {

    }
}
