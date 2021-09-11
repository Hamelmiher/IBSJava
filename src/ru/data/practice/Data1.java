package ru.data.practice;

import java.util.Scanner;

public class Data1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String number1 = input.next();
        System.out.println("Введите второе число: ");
        int number2 = input.nextInt();
        if (Integer.parseInt(number1) > number2) {
            System.out.println(number1);
            System.out.println(Double.valueOf(number2));
        } else {
            System.out.println(number2);
            System.out.println(Double.valueOf(number1));
        }
    }
}
