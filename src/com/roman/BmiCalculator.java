package com.roman;

import java.util.Scanner;

public class BmiCalculator {

    public String calc(double height, double weight){

        double result;

        //Groesse in CM
        double convertedHeight = height/100;
        //BMI Formel Gewicht / Koerpergroesse in Meter ^ 2
        result = weight / Math.pow(convertedHeight, 2);

        if(result < 18.5){
            System.out.println("Untergewicht");
            return "Untergewicht";
        } else if(result >= 18.5 && result < 25){
            System.out.println("Normalgewicht");
            return "Normalgewicht";
        } else if(result >= 25 && result < 30){
            System.out.println("Uebergewicht");
            return "Uebergewicht";
        } else if(result >= 30){
            System.out.println("Schweres Uebergewicht");
            return "Schweres Uebergewicht";
        }
        return "Ungueltige Eingabe";
    }
}
