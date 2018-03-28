package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;

        System.out.println("Первое число:");
        num1 = scanner.nextDouble();
        System.out.println("Второе число:");
        num2 = scanner.nextDouble();
        result = num1 + num2;
        /* Ответ*/
        System.out.printf("Равно:%.4f", result);
        scanner.close();
        }
        }





