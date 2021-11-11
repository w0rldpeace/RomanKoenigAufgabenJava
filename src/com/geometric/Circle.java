package com.geometric;

import com.point.Point;

public class Circle extends AbstractGeometricObject {

    private static final double PI = Math.PI;
    private double radius;
    private final Point centerPoint;

    /**
     *
     * @param centerPoint
     * @param radius
     */
    public Circle(Point centerPoint, double radius) {
        super();
        this.radius = radius;
        this.centerPoint = centerPoint;
        calculateArea();
        calculateCircumference();
    }

    @Override
    public void calculateCircumference() {

        setCircumference(2 * PI * getRadius());
    }

    @Override
    public void calculateArea() {

        setArea(PI * Math.pow(getRadius(), 2));
    }

    public double getRadius() {

        return radius;
    }
}
