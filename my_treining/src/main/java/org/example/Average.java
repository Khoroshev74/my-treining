package org.example;
//Пожалуйста, перейдите к классу Average и напишите программу, которая читает последовательность целых чисел из стандартного ввода и находит среднее значение.
//Подробности:
//Вы должны читать значения последовательности до тех пор, пока не появится следующее 0. Нулевое значение означает конец входной последовательности.
//Последовательность гарантированно содержит хотя бы одно значение.
//Среднее значение также является целым числом . Используйте целочисленные операции .
import java.util.Scanner;
public class Average {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int averNum = num;
         int count = 0;
         while (num > 0) {
             num = sc.nextInt();
             count++;
             averNum = averNum + num;
             if (num == 0)
                 break;
         }
         System.out.println(averNum/count);
    }
}
