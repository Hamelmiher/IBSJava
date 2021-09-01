package ru.cycles.practice;

import java.util.Scanner;


public class Cycles3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        double[] myArray = new double[size]; // Создаём массив double размером в size
        System.out.println("Введите элемент массива:");
        for (int i = 0; i < size; i++) {
            myArray[i] = input.nextDouble();// Заполняем массив элементами, введёнными с клавиатуры
        }
        double avg = 0; //Объявляем среднее арифметическое
        for (int i = 0; i < size; i++) {
            avg = avg + myArray[i];
        }
        avg = avg / size;
        System.out.println("Среднее арифметическое: " + avg);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] * avg);
        }
    }
}