package ru.cycles.practice;
import java.util.Scanner;
public class Cycles2 {
    public static void main(String[] args) {
            System.out.print("Введите любое целое положительное число: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for (int i=1; i<= n; i++){
                if(i%2==1){
                    sum+=i;
                }
            }
            System.out.println (sum);
        }
    }

