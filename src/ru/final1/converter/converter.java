package ru.final1.converter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текущий крус доллара: ");
        double course = input.nextDouble();
        System.out.println("Введите количество рублей: ");
        double roubles = input.nextDouble();
        double outcome = roubles/course;
        DecimalFormat df = new DecimalFormat("###.00");
        System.out.println("Итог: " +  df.format(outcome));
    }
}
