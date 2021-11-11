package com.geometric;

import com.point.Point;

public class Circle implements GeometricObject {

    private static final double PI = 3.14159265359; // Math.pi
    private double radius;
    private Point centerPoint;

    /**
     * Formeln fuer die Berechnung des Umfangs und Flaeche von einem Kreis
     * U = 2*pi*r, pi*d
     * A = pi*r^2
     */
    public Circle() {

    }

    public Circle(Point centerPoint, double radius) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }

    @Override
    public double calculateCircumference() {
        double circumference = 2 * PI * getRadius();
        return circumference;
    }

    @Override
    public double calculateArea() {
        double area = PI * Math.pow(getRadius(), 2);
        return area;
    }

    public double getRadius() {

        return radius;
    }
}
