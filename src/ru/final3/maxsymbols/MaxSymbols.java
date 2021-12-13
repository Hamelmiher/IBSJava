package ru.final3.maxsymbols;

import java.util.Scanner;

public class MaxSymbols {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите количество строк массива: ");
        a = input.nextInt(); // Читаем с клавиатуры количество строк
        int[] myArray = new int[a];// Создаём массив размером в a
        System.out.println("Введите элемент массива:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = input.nextInt(); //Заполняем строки
        }
        System.out.println(myArray.chars().distinct().count());
    }
}


       /* for (int i = 0; i < myArray.length; i++) {
        System.out.println(myArray[i].chars().distinct().count());
        }
        System.out.println(Arrays.toString(myArray));*/

