package ru.cycles.practice;

import java.util.Scanner;


public class Cycles1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        int constX = 2;
        int constY = 3;
        int constZ = 5;
        System.out.println("Введите размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] myArray = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элемент массива:");
        for (int i = 0; i < size; i++) {
            myArray[i] = input.nextInt();// Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int i = 0; i < size; i++) {
            if (myArray[i] == constX) {
                System.out.println("Данное значение " + constX + " имеется в константах");
                break;
            } else if (myArray[i] == constY) {
                System.out.println("Данное значение " + constY + " имеется в константах");
                break;
            } else if (myArray[i] == constZ) {
                System.out.println("Данное значение " + constZ + " имеется в константах");
            }
        }
    }
}
