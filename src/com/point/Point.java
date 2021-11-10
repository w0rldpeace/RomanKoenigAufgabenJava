package com.point;

public class Point {

    private Double x;
    private Double y;
    private String name;

    //Leerer Konstruktor
    public Point(){

    }
    //Hauptkonstruktor
    public Point(Double x, Double y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    //die toString Methode ist hier ueberschrieben und auf meine Felder angewendet per IDE
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     *
     * @param a Erster Punkt
     * @param b Zweiter Punkt
     * @param name Name des neuen Punkts
     * @return Gibt einen neuen Punkt vom Typ "Point" zurueck
     */
    public Point addCoordinates(Point a, Point b, String name){
        x = a.getX() + b.getX();
        y = a.getY() + b.getY();
        return new Point(x, y, name);
    }

    public Point subtractCoordinates(Point a, Point b, String name){
        x = a.getX() - b.getX();
        y = a.getY() - b.getY();
        return new Point(x, y, name);
    }

    public Point multiplyCoordinates(Point a, Point b, String name){
        x = a.getX() * b.getX();
        y = a.getY() * b.getY();
        return new Point(x, y, name);
    }

    public Point divideCoordinates(Point a, Point b, String name){
        x = a.getX() / b.getX();
        y = a.getY() / b.getY();
        return new Point(x, y, name);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
