package com.geometric;

public interface GeometricObject {
    double circumferenceCircle(Circle c);
    double circumferenceRectangle(Rectangle r);
    double circumferenceTriangle(Triangle t);

    double areaCircle(Circle c);
    double areaRectangle(Rectangle r);
    double areaTriangle(Triangle t);

//    double calcCircumference();
//    double calcArea();
}
