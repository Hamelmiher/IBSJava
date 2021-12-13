package ru.operators.practice;

import java.util.Scanner;

class Operators2 {

    public static void main(String[] args) {


            Scanner scn = new Scanner(System.in);
            String answer;
            System.out.print("Введите первое число: ");
            double numA = scn.nextDouble();
            System.out.print("Введите второе число: ");
            double numB = scn.nextDouble();
            System.out.println("Введите оператор");
            double result = 0;

            answer = scn.next();

            if(answer.equals("+")){
                result = numA + numB;
            }

            else if(answer.equals("-")){
                result = numA - numB;
            }

            else if (answer.equals("*")){
                result = numA * numB;
            }

            else if (answer.equals("/")){
                result = numA / numB;
            }

            System.out.println("Результат операции: " + result);
            }
        }

