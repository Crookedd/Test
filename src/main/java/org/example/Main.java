package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число для теста: ");
        int number = scanner.nextInt();


        /*System.out.println("Тестовое задание");
        System.out.println(inc(number));

        System.out.println("Задача №1");
        //printFizzBuzz();

        System.out.println("Задача №2");
        reverseString("make install");*/

        System.out.println("Задача №3");
        System.out.println("Число А:");
        double A = scanner.nextDouble();
        System.out.println("Число B:");
        double B = scanner.nextDouble();
        System.out.println("Число C:");
        double C = scanner.nextDouble();
        System.out.println(squareRoots(A,B,C));

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

    //Задача 3
    public static String squareRoots(double a,double b, double c) {
        double discriminant = b * b - 4 * a * c;
        StringBuilder result = new StringBuilder();
        if(discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            result.append("Вещественные корни существуют:\n");
            result.append("Корень 1: ").append(root1).append("\n");
            result.append("Корень 2: ").append(root2).append("\n");
        } else if(discriminant == 0) {
            double root = -b / (2 * a);
            result.append("Вещественный корень существует:\n");
            result.append("Корень: ").append(root).append("\n");
        } else {
            result.append("Нет вещественных корней\n");
        }
        return  result.toString();
    }
}