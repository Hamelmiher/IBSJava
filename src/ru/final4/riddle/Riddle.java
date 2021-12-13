package ru.final4.riddle;
import java.util.Scanner;

public class Riddle {
    static Scanner input = new Scanner(System.in);
    static String question = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
    static String correctAnswer = "Заархивированный вирус";
    static String corrects = "Правильно!";
    static String help = "Подсказка";
    static String helpAnswer = "Проблемы в архиве";
    static String helpForbidden = "Подсказка недоступна";
    static String error = "Обидно, приходи в другой раз";
    static String nextAttempt = "Подумай!";

    public static void main(String[] args) {
        System.out.println(question);
        System.out.println("Попытка номер 1: ");
        String firstTry = input.nextLine();
        if (firstTry.contains(correctAnswer)) {
            rightAnswer();
            return;
        }
        if (firstTry.contains(help)) {
            help();
            return;
        } else {
            System.out.println(nextAttempt);
        }
        System.out.println("Попытка номер 2: ");
        String secondTry = input.nextLine();
        if (secondTry.contains(correctAnswer)) {
            rightAnswer();
            return;
        }
        if (secondTry.contains(help)) {
            helpForbidden2try();
        } else {
            System.out.println(nextAttempt);
        }
        System.out.println("Попытка номер 3: ");
        String thirdTry = input.nextLine();
        if (thirdTry.contains(correctAnswer)) {
            rightAnswer();
            return;
        }
        if (thirdTry.contains(help)) {
            helpForbidden3try();
        } else {
            System.out.println(error);
        }
    }
    public static void helpForbidden2try() {
        System.out.println(helpForbidden);
        String TryAfterHelp = input.nextLine();
        if (TryAfterHelp.contains(correctAnswer)) {
            System.out.println(corrects);
        } else {
            System.out.println(nextAttempt);
        }
    }
    public static void helpForbidden3try() {
        System.out.println(helpForbidden);
        String TryAfterHelp = input.nextLine();
        if (TryAfterHelp.contains(correctAnswer)) {
            System.out.println(corrects);
        } else {
            System.out.println(error);
        }
    }
    public static void help() {
        System.out.println(helpAnswer);
        String helpAsked = input.nextLine();
        if (helpAsked.contains(correctAnswer)) {
            System.out.println(corrects);
        } else {
            System.out.println(error);
        }
    }
    public static void rightAnswer() {
        System.out.println(corrects);
    }
}