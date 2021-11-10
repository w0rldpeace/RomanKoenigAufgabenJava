package com.point;

public class Vector {

    Double x;
    Double y;
    Double z;
    Double newX, newY, newZ;
    String name;
    Double scalarProduct;
    Double vectorLength;
    /**
     * Formel fuer...
     * Skalarprodukt -> xa*xb+ya*yb+za*zb scalarProduct -> return double
     * Kreuzprodukt ->
     *       a2*b3−a3b2
     *       a3*b1−a1*b3
     *       a1*b2−a2*b1 -> crossProduct -> return neuer Vektor
     * Vektorlaenge -> Wurzel aus x^2 + y^2 + z^2 -> vectorLength -> return double
     *
     *

     */

    public Vector(){

    }

    /**
     * Konstruktor fuer 3D Vektor
     *
     * @param x
     * @param y
     * @param z
     * @param name eindeutiger Name des Vektors.
     */
    public Vector(Double x, Double y, Double z, String name){
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    /**
     * Konstruktor fuer 2D Vektor
     * @param x
     * @param y
     * @param name eindeutiger Name des Vektors.
     */
    public Vector(Double x, Double y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    /**
     * Addiert Vektoren in einem 3D Raum
     * @param a Vektor 1
     * @param b Vektor 2
     * @param name Eindeutiger Name des neuen Vektors
     * @return new Vector()
     */
    public Vector add3dVector(Vector a, Vector b, String name){

        newX = a.getX() + b.getX();
        newY = a.getY() + b.getY();
        newZ = a.getZ() + b.getZ();

        return new Vector(newX, newY, newZ, name);
    }

    /**
     *
     * Addiert zwei Vektoren in einem 2D Raum
     * @param a Vektor 1
     * @param b Vektor 2
     * @param name Eindeutiger Name des neuen Vektors
     * @return new Vector()
     */
    public Vector add2dVector(Vector a, Vector b, String name){
        newX = a.getX() + b.getX();
        newY = a.getY() + b.getY();

        return new Vector(newX, newY, name);
    }

    /**
     * Subtrahiert zwei Vektoren in einem 3D Raum
     * @param a Vektor 1
     * @param b Vektor 2
     * @param name Eindeutiger Name des neuen Vektors
     * @return new Vector();
     */
    public Vector subtract3dVector(Vector a, Vector b, String name){
        newX = a.getX() - b.getX();
        newY = a.getY() - b.getY();
        newZ = a.getZ() - b.getZ();

        return new Vector(newX, newY, newZ, name);
    }

    /**
     * Subtrahiert zwei Vektoren in einem 2D Raum
     * @param a Vektor 1
     * @param b Vektor 2
     * @param name Eindeutiger Name des neuen Vektors
     * @return new Vector();
     */
    public Vector subtract2dVector(Vector a, Vector b, String name){
        newX = a.getX() - b.getX();
        newY = a.getY() - b.getY();

        return new Vector(newX, newY, name);
    }

    /**
     * Berechnet das Skalarprodukt zweier Vektoren. Berechnet das Skalarprodukt
     * sowohl von 2D als auch 3D Vektoren
     * @param a Vektor 1
     * @param b Vektor 2
     * @return  Skalarprodukt -> double
     */
    public Double scalarProduct(Vector a, Vector b){
        if(a.getZ().isNaN() && b.getZ().isNaN()){
            scalarProduct = a.getX()*b.getX() + a.getY()*b.getY();
        } else {
            scalarProduct = a.getX()*b.getX() + a.getY()*b.getY() + a.getZ()*b.getZ();
        }
        return scalarProduct;
    }

    /**
     * Berechnet das Kreuzprodukt zweier Vektoren.
     * @param a Vektor 1
     * @param b Vektor 2
     * @param name Eindeutiger Name des neuen Vektors.
     * @return new Vector()
     */
    public Vector crossProduct(Vector a, Vector b, String name){

        newX = a.getY()*b.getZ() - a.getZ()*b.getY();
        newY = a.getZ()*b.getX() - a.getX()*b.getZ();
        newZ = a.getX()*b.getY() - a.getY()*b.getX();

        return new Vector(newX, newY, newZ, name);
    }

    /**
     * Methode fuer Skalare Multiplikation. Unterscheidet zwischen 2D und 3D Vektoren
     * @param a Vektor 1
     * @param scalar Skalar
     * @param name Eindeutiger Name des neuen Vektors
     * @return new Vector()
     */
    public Vector scalarMultiplication(Vector a, Double scalar, String name){
        if(a.getZ().isNaN()){
            newX = a.getX()*scalar;
            newY = a.getY()*scalar;

            return new Vector(newX, newY, name);
        } else {
            newX = a.getX()*scalar;
            newY = a.getY()*scalar;
            newZ = a.getZ()*scalar;

            return new Vector(newX, newY, newZ, name);
        }
    }

    /**
     * Methode fuer Skalare Division. Unterscheidet zwischen 2D und 3D Vektoren
     * @param a Vektor 1
     * @param scalar Skalar
     * @param name Eindeutiger Name des neuen Vektors
     * @return new Vector()
     */
    public Vector scalarDivision(Vector a, Double scalar, String name){
        if(a.getZ().isNaN()){
            newX = a.getX()/scalar;
            newY = a.getY()/scalar;

            return new Vector(newX, newY, name);
        } else {
            newX = a.getX()/scalar;
            newY = a.getY()/scalar;
            newZ = a.getZ()/scalar;

            return new Vector(newX, newY, newZ, name);
        }
    }

    /**
     * Berechnet die Laenge eines Vektors
     * @param a Der zu berechnende Vektor.
     * @return Vektorlaenge -> double
     */
    public Double getVectorLength(Vector a){
        vectorLength = Math.sqrt(Math.pow(a.getX(), 2) + Math.pow(a.getY(), 2) + Math.pow(a.getZ(), 2));
        return vectorLength;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
