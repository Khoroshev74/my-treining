package org.example;
//Пожалуйста, перейдите к FindMaxInSeq и напишите программу, которая считывает последовательность целых чисел из стандартного вывода и находит максимальное значение. Вы должны поместить свое решение в maxметод для прохождения тестов.
//Подробности:
//Вы должны читать значения последовательности до тех пор, пока не появится следующее 0. Нулевое значение означает конец входной последовательности.
//Последовательность гарантированно содержит хотя бы одно значение.
import java.util.Scanner;
public class FindMaxInSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numMax = num;
        while (num > 0) {
            num = sc.nextInt();
            if (num == 0)
                break;
            if (num > numMax) {
                numMax = num;
            }
        }
        System.out.println(numMax);

    }
}
