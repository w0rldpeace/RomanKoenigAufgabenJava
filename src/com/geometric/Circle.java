package com.geometric;

import com.point.Point;

public class Circle extends Point implements GeometricObject {

    private static final double PI = 3.14159265359; // Math.pi
    private double radius;
    private Point centerPoint;

    /**
     * Formeln fuer die Berechnung des Umfangs und Flaeche von einem Kreis
     * U = 2*pi*r, pi*d
     * A = pi*r^2
     */
    public Circle(){

    }

    public Circle(Point centerPoint, double radius) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }

    @Override
    public double circumferenceCircle(Circle c) {
        double centerPoint = c.getX();
        double circumference = 2 * PI * c.getRadius();
        return circumference;
    }

    @Override
    public double areaCircle(Circle c) {
        double area = PI * Math.pow(c.getRadius(), 2);
        return area;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double circumferenceRectangle(Rectangle r) {
        return 0;
    }

    @Override
    public double circumferenceTriangle(Triangle triangle) {
        return 0;
    }


    @Override
    public double areaRectangle(Rectangle r) {
        return 0;
    }

    @Override
    public double areaTriangle(Triangle triangle) {
        return 0;
    }
}
