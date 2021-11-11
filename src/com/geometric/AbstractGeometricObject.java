package com.geometric;

public abstract class AbstractGeometricObject {

    private double area;
    private double circumference;

    public abstract void calculateArea();
    public abstract void calculateCircumference();

    //Getter
    public double getArea() {

        return area;
    }

    public double getCircumference() {

        return circumference;
    }

    //Setter
    public void setArea(double area) {

        this.area = area;
    }

    public void setCircumference(double circumference) {

        this.circumference = circumference;
    }
}
