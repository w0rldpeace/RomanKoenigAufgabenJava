package com.roman;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    Scanner sc;
    int min = 0;
    int max = 100;
    int guess = 0;

    public NumberGuess(){
        System.out.println("Erraten Sie eine Zahl zwischen 1 und 100.");
        sc = new Scanner(System.in);
    }

    // Gibt eine Zufallszahl von 0 - 100
    Random random = new Random();
    int value = random.nextInt(max + min) + min;

    public void guessNumber(){

        while (guess != value){
            System.out.println("Geben Sie eine Zahl ein.");
            guess = sc.nextInt();

            if (guess == value){
                System.out.println(guess +" ist richtig. Zahl erraten! Glueckwunsch!");
            } else if (guess < value){
                System.out.println("Die gesuchte Zahl ist groesser!");
            } else if (guess > value){
                System.out.println("Die gesuchte Zahl ist kleiner!");
            }
        }
        sc.close();
    }
}
