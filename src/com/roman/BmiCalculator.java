package com.roman;

import java.util.Scanner;

public class BmiCalculator {

    public static String calc(double height, double weight){

        double result;
        //Groesse in CM
        double convertedHeight = height/100;
        result = weight / Math.pow(convertedHeight, 2);
        System.out.println(result);

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
