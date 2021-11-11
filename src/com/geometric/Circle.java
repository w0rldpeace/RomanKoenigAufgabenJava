package com.geometric;

import com.point.Point;

public class Circle extends AbstractGeometricObject implements GeometricObject {

    private static final double PI = 3.14159265359; // Math.pi
    private double radius;
    private final Point centerPoint;

    /**
     * Formeln fuer die Berechnung des Umfangs und Flaeche von einem Kreis
     * U = 2*pi*r, pi*d
     * A = pi*r^2
     */

    //super wird als erstes aufgerufen
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
