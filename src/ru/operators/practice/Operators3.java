package ru.operators.practice;

import java.util.Scanner;

public class Operators3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        double num = scanner.nextDouble();
        double massOrDist = getMassOrDist();
        double unit;
        if (massOrDist == 1) {
            unit = getUnitOfMass();
        } else {
            unit = getUnitOfMeasure();
        }
        calculate(massOrDist, unit, num);
    }

    public static double getMassOrDist() {
        boolean flag = true;
        int num = 0;
        while (flag) {
            System.out.println("Выберите что переводить:  1 - масса, 2 - расстояние");
            if (!scanner.hasNextInt()) {
                System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
                scanner.next();
            } else {
                num = scanner.nextInt();
                if (num != 1 && num != 2) {
                    System.out.println("Вы допустили ошибку при вводе операции. Введите число 1 или 2");
                    continue;
                }
                flag = false;
            }
        }
        return num;
    }

    public static double getUnitOfMeasure() {
        boolean flag = true;
        double num = 0;
        while (flag) {
            System.out.println("Выберите единицу измерения:  1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            if (!scanner.hasNextInt()) {
                System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
                scanner.next();
            } else {
                num = scanner.nextInt();
                if (num != 1 && num != 2 && num != 3 && num != 4) {
                    System.out.println("Вы допустили ошибку при вводе операции. Введите число от 1 до 4.");
                } else {
                    flag = false;
                }
            }
        }
        return num;
    }

    public static double getUnitOfMass() {
        boolean flag = true;
        double num = 0;
        while (flag) {
            System.out.println("Введите число:  1 - кг, 2 - г, 3 - мГ");
            if (!scanner.hasNextInt()) {
                System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
                scanner.next();
            } else {
                num = scanner.nextInt();
                if (num != 1 && num != 2 && num != 3) {
                    System.out.println("Вы допустили ошибку при вводе операции. Введите число от 1 до 3.");
                } else {
                    flag = false;
                }
            }
        }
        return num;
    }

    public static void calculate(double massOrDist, double unit, double num) {
        double result;
        double result2;
        double result3;
        double result4;
        if (massOrDist == 1) { // Выбрали массу
            if (unit == 1) {
                result = num; //КГ
                result2 = num / 0.001; //Г
                result3 = num / 0.000001; //МГ
                System.out.println("Килограммы: " + result);
                System.out.println("Граммы: " + result2);
                System.out.println("Милиграммы: " + result3);
            } else if (unit == 2) {
                result = num * 0.001;
                result2 = num;
                result3 = num / 0.001;
                System.out.println("Килограммы: " + result);
                System.out.println("Граммы: " + result2);
                System.out.println("Милиграммы: " + result3);
            } else if (unit == 3) {
                result = num * 0.000001;
                result2 = num * 0.001;
                result3 = num;
                System.out.println("Килограммы: " + result);
                System.out.println("Граммы: " + result2);
                System.out.println("Милиграммы: " + result3);
            }
        } else { //Выбрали Расстояние
            if (unit == 1) {
                result = num; //Метры
                result2 = num * 0.0006; //Мили
                result3 = num * 1.09361; //Ярды
                result4 = num * 3.28083; //Футы
                System.out.println("Метры: " + result);
                System.out.println("Мили: " + result2);
                System.out.println("Ярды: " + result3);
                System.out.println("Футы: " + result4);
            } else if (unit == 2) {
                result = num * 1609.34;
                result2 = num;
                result3 = num * 1760;
                result4 = num * 5280;
                System.out.println("Метры: " + result);
                System.out.println("Мили: " + result2);
                System.out.println("Ярды: " + result3);
                System.out.println("Футы: " + result4);
            } else if (unit == 3) {
                result = num * 0.9144;
                result2 = num * 0.0005;
                result3 = num;
                result4 = num * 3;
                System.out.println("Метры: " + result);
                System.out.println("Мили: " + result2);
                System.out.println("Ярды: " + result3);
                System.out.println("Футы: " + result4);
            } else if (unit == 4) {
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
    }
}