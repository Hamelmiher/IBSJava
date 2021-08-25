package ru.operators.practice;

import java.util.Scanner;

class Operators3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int num = getInt();
        int MassOrDist = getInt(); //Не понимаю как задействовать класс getMassOrDist, так что бы все работало
        int UnitOfMeasure = getInt(); //Не понимаю как задействовать класс getUnitOfMeasure, так что бы все работало
        int result = calculate(MassOrDist,UnitOfMeasure,num);
    }
    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
    public static int getMassOrDist() {
        System.out.println("Выберите массу или расстояние:");
        int MassOrDist;
        if (scanner.hasNext()) {
            MassOrDist = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            MassOrDist = getMassOrDist();
        }
        return MassOrDist;
    }
    public static int getUnitOfMeasure() {
        System.out.println("Введите единицу измерения:");
        int UnitOfMeasure;
        if (scanner.hasNext()) {
            UnitOfMeasure = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            UnitOfMeasure = getUnitOfMeasure();
        }
        return UnitOfMeasure;
    }
    public static int calculate(int MassOrDist, int UnitOfMeasure, int num)
    {
        double result;
        double result2;
        double result3;
        double result4;
        if (MassOrDist == 1) { // Выбрали массу
            if (UnitOfMeasure == 1) { //Выбрали КГ
                result = num; //КГ
                result2 = num / 0.001; //Г
                result3 = num / 0.0001; //МГ
                System.out.println("Килограммы: " + result);
                System.out.println("Граммы: " + result2);
                System.out.println("Милиграммы: " + result3);
            }
            else if (UnitOfMeasure == 2) { //Выбрали Г
                result = num * 0.001;
                result2 = num;
                result3 = num / 0.0001;
                System.out.println("Килограммы: " + result);
                System.out.println("Граммы: " + result2);
                System.out.println("Милиграммы: " + result3);
            }
            else if (UnitOfMeasure == 3) { //ВЫбрали МГ
                result = num * 0.001;
                result2 = num * 0.0001;
                result3 = num;
                System.out.println("Килограммы: " + result);
                System.out.println("Граммы: " + result2);
                System.out.println("Милиграммы: " + result3);
            }
        } else if (MassOrDist == 2) { //Выбрали Расстояние
            if (UnitOfMeasure == 1) { //Выбрали метры
                result = num; //Метры
                result2 = num * 0.0006; //Мили
                result3 = num * 1.09361; //Ярды
                result4 = num * 3.28083; //Футы
                System.out.println("Метры: " + result);
                System.out.println("Мили: " + result2);
                System.out.println("Ярды: " + result3);
                System.out.println("Футы: " + result4);
            }
            else if (UnitOfMeasure == 2) { //Выбрялаи мили
                result = num * 1609.34;
                result2 = num;
                result3 = num * 1760;
                result4 = num * 5280;
                System.out.println("Метры: " + result);
                System.out.println("Мили: " + result2);
                System.out.println("Ярды: " + result3);
                System.out.println("Футы: " + result4);
            }
            else if (UnitOfMeasure == 3) { //Выбрали ярды
                result = num * 0.9144;
                result2 = num * 0.0005;
                result3 = num;
                result4 = num * 3;
                System.out.println("Метры: " + result);
                System.out.println("Мили: " + result2);
                System.out.println("Ярды: " + result3);
                System.out.println("Футы: " + result4);
            }
            else if (UnitOfMeasure == 4) { //Выбрали футы
                result = num * 0.3048;
                result2 = num * 0.0001;
                result3 = num * 0.333;
                result4 = num;
                System.out.println("Метры: " + result);
                System.out.println("Мили: " + result2);
                System.out.println("Ярды: " + result3);
                System.out.println("Футы: " + result4);
            }

        }
        else System.out.println("Что-то не так"); //При поломках
        return MassOrDist;
    }
}