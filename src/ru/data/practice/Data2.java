package ru.data.practice;
import java.util.Scanner;

public class Data2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите \"I like Java!!!\"");
        String javaLover = input.nextLine();
        if (javaLover.contains("Java")) {
            if (javaLover.startsWith("I like")){
                if (javaLover.endsWith("!!!")){
                    System.out.println(javaLover.toUpperCase());
                    String jovo = javaLover.substring(7,11);
                    System.out.println(jovo.replaceAll("a", "o"));
                }
                else {
                    System.out.println("Потерялись \"!!!\"");
                }
            }
            else {
                System.out.println("Потерялось \"I like\"");
            }
       }
        else {
            System.out.println("Потерялась \"Java\"");
        }
    }
}
