package com.geometric;

import com.point.Point;
import com.point.Vector;

public class Triangle implements GeometricObject {

    private Point a, b, c;
    private double area, circumference;

    //Pruefe Punkte mit Pythagoras ob es ueberhaupt ein Dreieck ist.
    public Triangle(){

    }

    public Triangle(Point a, Point b, Point c){

        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Methode zum Berechnen der Seitenlaengen eines Dreiecks
     * @param calculatedPoint
     * @return
     */
    private double sideLength(Point calculatedPoint){
        double length = Math.sqrt(Math.pow(calculatedPoint.getX(), 2) + Math.pow(calculatedPoint.getY(), 2));
        return length;
    }

    public Vector calculateDirectionVector(Vector vector1, Vector vector2){
        Vector direction;
        direction = vector1.subtract2dVector(vector1,vector2,"dirVector");

        return direction;
    }

    /**
     * Formeln fuer die Berechnung des Umfangs und Flaeche von einem Dreieck
     * U = a+b+c
     * A = 1/2*g*h
     */
    @Override
    public double circumferenceTriangle(Triangle triangle) {

        double ab = sideLength(a.subtractCoordinates(b,a,"Seite AB"));
        double ca = sideLength(a.subtractCoordinates(c,a,"Seite AC"));
        double cb = sideLength(a.subtractCoordinates(c,b,"Seite CB"));
        circumference = ab + ca + cb;

        return circumference;
    }

    @Override
    public double areaTriangle(Triangle triangle) {
        Vector directionA;
        Vector directionB;
        double area;

        Vector v1 = new Vector(a.getX(), a.getY(), "Vektor AB");
        Vector v2 = new Vector(b.getX(), b.getY(), "Vektor AC");
        Vector v3 = new Vector(c.getX(), c.getY(), "Vektor CB");

        directionA = calculateDirectionVector(v2,v1);
        directionB = calculateDirectionVector(v3,v1);
        area = 0.5 * (directionA.getX() * directionB.getY() - directionA.getY() * directionB.getX());

        return area;
    }

    @Override
    public double areaCircle(Circle c) {
        return 0;
    }
    @Override
    public double areaRectangle(Rectangle r) {
        return 0;
    }
    @Override
    public double circumferenceCircle(Circle c) {
        return 0;
    }
    @Override
    public double circumferenceRectangle(Rectangle r) {
        return 0;
    }
}
