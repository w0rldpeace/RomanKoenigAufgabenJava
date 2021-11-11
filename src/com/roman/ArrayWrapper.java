package com.roman;

public class ArrayWrapper {
    private int elementCount;
    private int[] intArray;

    public ArrayWrapper(int arrayLength){
        elementCount = 0;
        intArray = new int[arrayLength];
    }

    public void add(int number){

        boolean arrayLengthNotSufficient = elementCount >= intArray.length;

        if(arrayLengthNotSufficient){
            int[] newArray = new int[intArray.length*2];
            for(int i = 0; i < intArray.length;i++){
                newArray[i] = intArray[i];
            }
            intArray = newArray;
        }
        intArray[elementCount] = number;
        elementCount++;
    }

    public int getElement(int count){

        return intArray[count];
    }

    public int getArraySize(){

        return intArray.length;
    }

    public int getElementCount(){

        return elementCount;
    }
}

