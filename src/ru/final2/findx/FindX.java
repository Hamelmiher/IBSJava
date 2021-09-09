package ru.final2.findx;
import java.util.Scanner;


public class FindX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String number1 = input.next();
        String sign = input.next();
        String number2 = input.next();
        String equals = input.next();
        String number3 = input.next();
        if (sign.equals("-")) {
            if (number1.equals("x")) {
                System.out.println(Integer.parseInt(number3) + Integer.parseInt(number2));
            }
            if (number2.equals("x")) {
                System.out.println(Integer.parseInt(number1) - Integer.parseInt(number3));
            }
            if (number3.equals("x")) {
                System.out.println(Integer.parseInt(number1) - Integer.parseInt(number2));
            }
        } else {
            if (number1.equals("x")) {
                System.out.println(Integer.parseInt(number3) - Integer.parseInt(number2));
            }
            if (number2.equals("x")) {
                System.out.println(Integer.parseInt(number3) - Integer.parseInt(number1));
            }
        }
    }
}
