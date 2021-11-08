package com.roman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeastCommonMultiple {

    List<Integer> firstList = new ArrayList<>();
    List<Integer> secondList = new ArrayList<>();
    int commonMultiple;
    int firstNumber;
    int secondNumber;

    public int calculateCommonMultiple(int firstNumber, int secondNumber){

        //Wenn die Falsche Eingabe
        if (firstNumber <= 0 || secondNumber <= 0){
            System.out.println("Bitte keine negative Zahl eingeben");
            return -2;
        }
        for(int i = 1; i <= 10; i++){
            int first = firstNumber * i;
            firstList.add(first);
            int second = secondNumber * i;
            secondList.add(second);
        }

        for (int number1 : firstList){
            for(int number2 : secondList){
                if(number1 == number2){
                    commonMultiple = number1;
                    System.out.println("KgV ist " + commonMultiple);
                    return commonMultiple;
                }
            }
        }
        //Sonstige Fehler
        return -1;
    }

}
