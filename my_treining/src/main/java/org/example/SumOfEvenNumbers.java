package org.example;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] age = new int[]{2, 34, -65 , 134};
        int result = 0;
        for (int i = 0; i < age.length; i++){
            result += age[i];
        }
        System.out.println("Sum value = " + result);
    }
}
