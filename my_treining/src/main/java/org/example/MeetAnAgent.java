package org.example;
//Пожалуйста, перейдите к классу MeetAnAgent и напишите программу, которая:
//Просит ввести номер
//Если ввод равен номеру секретного пароля, печатает «Привет, агент».
//В противном случае печатает "Отказано в доступе"
//Секретный пароль хранится в final static int PASSWORD.

import java.util.Scanner;
public class MeetAnAgent {
    final static int PASSWORD = 133976;
    public static void mail(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Password: ");
        int number = scanner.nextInt();
        if (number == PASSWORD) {
            System.out.println("Hello, Agent!");
        }else {
            System.out.println("Access denied");
        }
        
    }

}
