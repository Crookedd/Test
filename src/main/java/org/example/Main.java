package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();


        System.out.println("Тестовое задание");
        System.out.println(inc(number));
        System.out.println("Задача №1");
        //printFizzBuzz();
        System.out.println("Задача №2");
        reverseString("make install");
        System.out.println("Задача №3");
        System.out.println("Задача №4");
        System.out.println("Задача №5");
    }

    public static  int inc(int number) {
        return  number + 1;
    }
    //Задача 1. Перебираем числа.
    public static void printFizzBuzz() {
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //Задача 2. Работа с string
    public static void reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.println(reversed.toString());
    }


}