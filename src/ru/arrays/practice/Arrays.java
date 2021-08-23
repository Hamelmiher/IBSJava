package ru.arrays.practice;

public class Arrays {
    public static void main(String[] args) {
        int originalPosition = 0;
        int newPosition = 4;
        int[] myArray = {10,11,12,13,14};
        int temp = myArray[originalPosition];
        myArray[originalPosition] = myArray[newPosition];
        myArray[newPosition] = temp;
        int firstNum = myArray[0];
        int middleNum = myArray[myArray.length - 3];
        System.out.println(Integer.sum(firstNum,middleNum));
    }
}