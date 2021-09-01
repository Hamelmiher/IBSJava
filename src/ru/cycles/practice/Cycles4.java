package ru.cycles.practice;
import java.util.Scanner;
public class Cycles4 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите количество строк массива: ");
        a = input.nextInt(); // Читаем с клавиатуры количество строк
        System.out.println("Введите количество столбцов массива: ");
        b = input.nextInt();// Читаем с клавиатуры количество столбцов
        int[][] myArray = new int[a][b]; // Создаём массив размером в a строк и b столбцов
        System.out.println("Введите элемент массива:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                myArray[i][j] = input.nextInt();
            }
        }
        System.out.print("Первая строка массива умноженная на 3: ");
        for (int j = 0; j < b; j++) {
            System.out.print(myArray[0][j] * 3); //До вот этого myArray[0][j] я очень долго доходил :D
        }
    }
}