package com.geometric;

import com.point.Point;
import com.point.Vector;

public class Triangle extends AbstractGeometricObject{

    private final Point a, b, c;

    /**
     * Erstellt ein Dreieck anhand von 3 Punkten, die als Parameter uebergeben werden.
     * @param a Punkt 1
     * @param b Punkt 2
     * @param c Punkt 3
     */
    public Triangle(Point a, Point b, Point c){
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        calculateCircumference();
        calculateArea();
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
    public void calculateCircumference() {

        double ab = sideLength(a.subtractCoordinates(b,a,"Seite AB"));
        double ca = sideLength(a.subtractCoordinates(c,a,"Seite AC"));
        double cb = sideLength(a.subtractCoordinates(c,b,"Seite CB"));
        setCircumference(ab + ca + cb);

    }


    @Override
    public void calculateArea() {
        Vector directionA;
        Vector directionB;

        Vector v1 = new Vector(a.getX(), a.getY(), "Vektor AB");
        Vector v2 = new Vector(b.getX(), b.getY(), "Vektor AC");
        Vector v3 = new Vector(c.getX(), c.getY(), "Vektor CB");

        directionA = calculateDirectionVector(v2,v1);
        directionB = calculateDirectionVector(v3,v1);
        setArea(0.5 * (directionA.getX() * directionB.getY() - directionA.getY() * directionB.getX()));
    }
}
