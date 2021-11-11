package com.geometric;

import com.point.Point;
import com.point.Vector;

public class Rectangle implements GeometricObject {
    /**
     * Formeln fuer die Berechnung des Umfangs und Flaeche von einem Rechteck
     * U = 2*(a+b)
     * A = a*b
     */
    private Point a, b, c, d;
    private double circumference;

    public Rectangle(){

    }

    public Rectangle(Point a, Point b, Point c, Point d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    private double sideLength(Point calculatedPoint){
        double length = Math.sqrt(Math.pow(calculatedPoint.getX(), 2) + Math.pow(calculatedPoint.getY(), 2));
        return length;
    }

    public Vector calculateDirectionVector(Vector vector1, Vector vector2){
        Vector direction;
        direction = vector1.subtract2dVector(vector1,vector2,"dirVector");

        return direction;
    }

    @Override
    public double calculateCircumference() {
        double ab = sideLength(a.subtractCoordinates(b,a,"Seite AB"));
        double cb = sideLength(a.subtractCoordinates(c,b,"Seite CB"));
        circumference = 2 * (ab + cb);

        return circumference;
    }

    @Override
    public double calculateArea() {
        Vector directionA;
        Vector directionB;
        double area;

        Vector v1 = new Vector(a.getX(), a.getY(), "Vektor AB");
        Vector v2 = new Vector(c.getX(), c.getY(), "Vektor AC");
        Vector v3 = new Vector(d.getX(), d.getY(), "Vektor AD");

        directionA = calculateDirectionVector(v2,v1);
        directionB = calculateDirectionVector(v3,v1);
        area = directionA.getX() * directionB.getY() - directionA.getY() * directionB.getX();

        return area;
    }

}
