package org.example;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double D;
        System.out.println("Программа решает квадратное уравнение:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        D = b*b - 4*a*c;
        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2*a);
            double x2 = (-b + Math.sqrt(D)) / (2*a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }else if(D == 0) {
            double x = -b / 2*a;
            System.out.println("Уравнение имеет единственный корень: x= " + x);
        }else {
            System.out.println("Уравнение не имеет корней");
        }

    }
}
