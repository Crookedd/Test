package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 5(0 задание тестовое, а остальное задачи): ");
        int input = scanner.nextInt();

        switch (input) {
            case (0):
                System.out.println("Введите число для теста: ");
                int number = scanner.nextInt();
                System.out.println(inc(number));
                break;
            case (1):
                System.out.println("Задача №1");
                printFizzBuzz();
                break;
            case (2):
                System.out.println("Задача №2");
                reverseString("make install");
                break;
            case (3):
                System.out.println("Задача №3");
                System.out.println("Число А:");
                double numberA = scanner.nextDouble();
                System.out.println("Число B:");
                double numberB = scanner.nextDouble();
                System.out.println("Число C:");
                double numberC = scanner.nextDouble();
                System.out.println(squareRoots(numberA,numberB,numberC));
                break;
            case (4):
                System.out.println("Задача №4");
                double result = seriesSum();
                System.out.println(result);
                break;
            case (5):
                System.out.println("Задача №5");
                break;
            default:
                System.out.println("Не правильный ввод");

        }
        scanner.close();
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
    public static String squareRoots(double numberA,double numberB, double numberC) {
        double discriminant = numberB * numberB - 4 * numberA * numberC;
        StringBuilder result = new StringBuilder();
        if(discriminant > 0) {
            double root1 = (-numberB + Math.sqrt(discriminant)) / (2 * numberA);
            double root2 = (-numberB - Math.sqrt(discriminant)) / (2 * numberA);
            result.append("Вещественные корни существуют:\n");
            result.append("Корень 1: ").append(root1).append("\n");
            result.append("Корень 2: ").append(root2).append("\n");
        } else if(discriminant == 0) {
            double root = -numberB / (2 * numberA);
            result.append("Вещественный корень существует:\n");
            result.append("Корень: ").append(root).append("\n");
        } else {
            result.append("Нет вещественных корней\n");
        }
        return  result.toString();
    }

    //Задача 4
    public static double seriesSum() {
        double sum = 0.0;
        double term;
        int number = 2;

        do {
            term = 1.0 / (number * number + number - 2);
            sum += term;
            number++;
        } while (term >= 0.000001);

        return term;
    }
}