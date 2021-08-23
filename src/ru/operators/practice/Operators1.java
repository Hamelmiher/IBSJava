package ru.operators.practice;

public class Operators1 {
    public static void main(String[] args) {
    double x = 10.0;
    double y = 15.0;
    double z = 7.0;
    double avg = (x + y + z)/3;
        System.out.println(avg);
        avg = Math.floor(avg/= 2);
            if (avg > 3){
                System.out.println("Программа выполнена корректно");
            }
    }
}
