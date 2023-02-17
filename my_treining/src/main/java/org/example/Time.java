package org.example;
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input seconds: ");
        int seconds = scanner.nextInt();
        int hour = (seconds/3600)%24;
        seconds = seconds%3600;
        int min = seconds/60;
        seconds = seconds%60;
        int sec = seconds;
        String strSec = (sec < 10) ? "0" + sec : Integer.toString(sec);
        String strMin = (min < 10) ? "0" + min : Integer.toString(min);
        String strHours = (hour < 10) ? "0" + hour : Integer.toString(hour);

        System.out.println(strHours + ":" + strMin + ":" + strSec);

    }
}
