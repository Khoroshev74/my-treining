package org.example;


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
