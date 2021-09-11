package ru.data.practice;
import java.util.Arrays;
import java.util.Scanner;

public class Data3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите буквы, цифры, слова на латинице и кирилице: ");
        String findLatin = input.nextLine();
        String findLatinClear = findLatin.replaceAll("[а-яА-я0-9]", "").replaceAll(" +", " ");
        System.out.println(findLatinClear);
        String [] myArray = findLatinClear.split(" ");
        System.out.println(myArray.length);
        System.out.println(Arrays.toString(myArray));
    }
}
