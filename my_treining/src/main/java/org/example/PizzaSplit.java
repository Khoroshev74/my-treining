package org.example;
//Посчитать минимальное количество пиц, с учетом количества кусочков и кол ва людей.
//На ввод количество людей и кусочков
import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int pice = sc.nextInt();
        int countPice = pice;
        int pizza = 1;
        while (people > 0) {
            pice = countPice;
            pice *= pizza;
            if (pice % people == 0) {
                break;
            }
            pizza ++;
        }
        System.out.println(pizza);
    }
}
