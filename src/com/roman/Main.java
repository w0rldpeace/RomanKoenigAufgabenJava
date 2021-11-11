package com.roman;

import com.geometric.Rectangle;
import com.point.Point;
import com.point.Vector;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hallo! Ich bin eins Code.");
//        Point a = new Point(4.0, 2.7, "Alpha");
//        Point b = new Point(8.0, 4.0, "Bravo");
//        Point c;
//
//        c = a.multiplyCoordinates(a,b,"Charlie");
//
//        System.out.println(c.toString());
        Vector a = new Vector(1.0,2.0,3.0,"Alpha");
        Vector b = new Vector(4.0,5.0,6.0,"Bravo");
        Vector c;

        c = a.add3dVector(a, b, "Charlie");


    }
}
