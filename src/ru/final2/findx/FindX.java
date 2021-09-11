package ru.final2.findx;
import java.util.Scanner;


public class FindX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String equation = input.next();
        if (equation.length() > 5) {
            System.out.println("Слишком длинное уравнение");
        } else if (equation.length() < 3) {
            System.out.println("В уравнении не хватает символов");
        } else {
            //char number1 = equation.charAt(0);
            String number1 = Character.toString(equation.charAt(0));
            String sign = Character.toString(equation.charAt(1));
            String number2 = Character.toString(equation.charAt(2));
            String equals = Character.toString(equation.charAt(3));
            String number3 = Character.toString(equation.charAt(4));
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
}


        /*String number1 = input.next();
        String sign = input.next();
        String number2 = input.next();
        String equals = input.next();
        String number3 = input.next();*/