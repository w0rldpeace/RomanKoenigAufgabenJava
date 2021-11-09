package com.roman;

import com.point.Point;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hallo! Ich bin eins Code.");
        Point a = new Point(4.0, 2.7, "Alpha");
        Point b = new Point(8.0, 4.0, "Bravo");
        Point c;

        c = a.multiplyCoordinates(a,b,"Charlie");

        System.out.println(c.toString());
    }
}
