package ru.final4.riddle;
import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Попытка номер 1: ");
        String firstsTry = input.nextLine();
        if (firstsTry.contains("Заархивированный вирус")) {
            System.out.println("Правильно!");
            return;
        }
        if (firstsTry.contains("Подсказка")) {
            System.out.println("Проблемы в архиве");
            String help = input.nextLine();
            if (help.contains("Заархивированный вирус")) {
                System.out.println("Правильно!");
                return;
            } else {
                System.out.println("Обидно, приходи в другой раз");
                return;
            }
        } else {
            System.out.println("Подумай!");
        }
        System.out.println("Попытка номер 2: ");
        String secondTry = input.nextLine();
        if (secondTry.contains("Заархивированный вирус")) {
            System.out.println("Правильно!");
            return;
        }
        if (secondTry.contains("Подсказка")) {
            System.out.println("Подсказка недоступна");
            String secondTryAfterHelp = input.nextLine();
            if (secondTryAfterHelp.contains("Заархивированный вирус")) {
                System.out.println("Правильно!");
                return;
            } else {
                System.out.println("Обидно, приходи в другой раз");
                return;
            }
        } else {
            System.out.println("Подумай!");
        }
        System.out.println("Попытка номер 3: ");
        String thirdTry = input.nextLine();
        if (thirdTry.contains("Заархивированный вирус")) {
            System.out.println("Правильно!");
            return;
        }
        if (thirdTry.contains("Подсказка")) {
            System.out.println("Подсказка недоступна");
            String thirdTryAfterHelp = input.nextLine();
            if (thirdTryAfterHelp.contains("Заархивированный вирус")) {
                System.out.println("Правильно!");
            } else {
                System.out.println("Обидно, приходи в другой раз");
            }
        } else {
            System.out.println("Обидно, приходи в другой раз");
        }
    }
}