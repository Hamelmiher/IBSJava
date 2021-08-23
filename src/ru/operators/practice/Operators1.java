package ru.operators.practice;

import java.util.Scanner;

class Operators1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getInt();
        double num2 = getInt();
        double num3 = getInt();
        double avg = (num1 + num2 + num3)/3;
        System.out.println("Среднее арифметическое: "+ avg);
        avg = Math.floor(avg / 2);
        if (avg > 3){
            System.out.println("Программа выполнена корректно");
        }
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next(); //рекурсия в случае ошибок
            num = getInt();
        }
        return num;
    }

}
