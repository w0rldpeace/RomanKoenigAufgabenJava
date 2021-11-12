package com.roman;

import java.util.Arrays;

public class ArrayWrapper<T> {
    private int elementCount;
    private T[] intArray;

    public ArrayWrapper(int arrayLength){
        elementCount = 0;
        intArray = (T[]) new Object[arrayLength];
    }

    public void add(T number){

        boolean arrayLengthNotSufficient = elementCount >= intArray.length;

        if(arrayLengthNotSufficient){
            T[] newArray = (T[]) new Object[intArray.length*2];
            for(int i = 0; i < intArray.length;i++){
                newArray[i] = intArray[i];
            }
            intArray = newArray;
        }
        intArray[elementCount] = number;
        elementCount++;
    }

    public void remove(T removeIndex){

        if(intArray == null || (int) removeIndex < 0 || (int) removeIndex >= intArray.length){
            System.out.println("Dieses Element kann nicht geloescht werden!");
        }
        T[] newArray = (T[]) new Object[intArray.length - 1];

        for(int i = 0, k = 0; i < intArray.length; i++){
            if(i == (int) removeIndex){
                continue;
            }
            newArray[k++] = intArray[i];
        }
        System.out.println("Array nach der Loeschoperation: " + Arrays.toString(newArray));

    }
    public int getElement(int count){

        return (int) intArray[count];
    }

    public int getArraySize(){

        return intArray.length;
    }

    public int getElementCount(){

        return elementCount;
    }
}

