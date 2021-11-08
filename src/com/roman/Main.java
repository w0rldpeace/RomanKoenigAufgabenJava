package com.roman;

import java.util.Scanner;

public class Main {

    public static boolean checkEvenNumber(int input){

        if(input%2 == 0){
            System.out.println(input + " ist eine gerade Zahl!");
            return true;
        } else {
            System.out.println(input + " ist eine ungerade Zahl!");
            return false;
        }
    }

    public static void main(String[] args) {
        //System.out.println("Hallo! Ich bin eins Code.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int i = sc.nextInt();
        checkEvenNumber(i);
    }
}
