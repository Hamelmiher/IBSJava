package ru.final4.riddle;
import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String question = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        String correctAnswer = "Заархивированный вирус";
        String corrects = "Правильно!";
        String help = "Подсказка";
        String helpAnswer = "Проблемы в архиве";
        String helpForbidden = "Подсказка недоступна";
        String error = "Обидно, приходи в другой раз";
        String nextAttempt = "Подумай!";
        System.out.println(question);
        System.out.println("Попытка номер 1: ");
        String firstsTry = input.nextLine();
        if (firstsTry.contains(correctAnswer)) {
            System.out.println(corrects);
            return;
        }
        if (firstsTry.contains(help)) {
            System.out.println(helpAnswer);
            String helpAsked = input.nextLine();
            if (helpAsked.contains(correctAnswer)) {
                System.out.println(corrects);
                return;
            } else {
                System.out.println(error);
                return;
            }
        } else {
            System.out.println(nextAttempt);
        }
        System.out.println("Попытка номер 2: ");
        String secondTry = input.nextLine();
        if (secondTry.contains(correctAnswer)) {
            System.out.println(corrects);
            return;
        }
        if (secondTry.contains(help)) {
            System.out.println(helpForbidden);
            String secondTryAfterHelp = input.nextLine();
            if (secondTryAfterHelp.contains(correctAnswer)) {
                System.out.println(corrects);
                return;
            } else {
                System.out.println(error);
                return;
            }
        } else {
            System.out.println(nextAttempt);
        }
        System.out.println("Попытка номер 3: ");
        String thirdTry = input.nextLine();
        if (thirdTry.contains(correctAnswer)) {
            System.out.println(corrects);
            return;
        }
        if (thirdTry.contains(help)) {
            System.out.println(helpForbidden);
            String thirdTryAfterHelp = input.nextLine();
            if (thirdTryAfterHelp.contains(correctAnswer)) {
                System.out.println(corrects);
            } else {
                System.out.println(error);
            }
        } else {
            System.out.println(error);
        }
    }
}