package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fn, sn, result;

        System.out.println("Введи первое число");
        fn = scanner.nextDouble();
        System.out.println("Введи второе число");
        sn = scanner.nextDouble();

        result = fn + sn;

        System.out.printf("Равно  %7.4f",result);
scanner.close();
    }
    }





