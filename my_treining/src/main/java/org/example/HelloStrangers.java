package org.example;
//Пожалуйста, перейдите к классу HelloStrangers и напишите программу, которая:
//Спрашивает число - количество незнакомцев, с которыми нужно встретиться
//Затем читает незнакомые имена построчно
//И, наконец, выводит построчно «Привет, имя незнакомца» для каждого незнакомца
//Гарантируется, что входные данные не равны нулю. Гарантируется, что входное значение счетчика незнакомцев — целое число.
import java.util.Scanner;
public class HelloStrangers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }

}
