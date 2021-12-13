package ru.data.practice;
import java.util.Arrays;

public class Data4 {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * (20 - (-20)) + 1) + (-20);
        }
        Arrays.sort(myArray);
        int minValue;
        minValue = myArray[0];
        int maxValue;
        maxValue = myArray[14];
        System.out.println("Максимальный элемент массива: " + maxValue);
        System.out.println("Минимальный элемент массива: " + minValue);
        if (Math.abs(minValue) > Math.abs(maxValue)) {
            System.out.println(myArray[0]);
        }
        else {
            System.out.println(myArray[14]);
        }
    }
}
