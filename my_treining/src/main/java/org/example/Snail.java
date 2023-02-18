package org.example;
<<<<<<< HEAD
//Представьте, что улитка aкаждый день поднимается на метр вверх по дереву. Затем улитка каждую ночь соскальзывает вниз по bногам. Высота дерева hфутов.
//Пожалуйста, перейдите к классу Улитка и напишите программу, которая печатает количество дней, в течение которых улитка доберется до вершины дерева.
//Программа читает a, b, hпострочно. Входные значения гарантированно будут положительными целыми числами.
//Если улитка не может добраться до вершины дерева, выведите сообщение Impossible.
=======
>>>>>>> f1a3a29d71a2a294f45dab21c55ef88d35bec6ff
import java.util.Scanner;
public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        if (a >= h) {
            System.out.println(1);
        }else if (a <= b) {
            System.out.println("Impossible");
        }else {
            int day = 0;
            int passed = 0;
            while (passed < h) {
                day++;
                passed = passed + a;
                if (passed >= h) {
                    break;
                }else {
                    passed = passed - b;
                }
            }
            System.out.println(day);
        }

    }
}




