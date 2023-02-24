package org.example;

public class MaxMethod {
    public static void main(String[] args) {
        //int[] age = {2, 6, 16, 54};
        //int Max = age[0];
        //for (int i = 1; i < age.length; i++) Max = Math.max(Max, age[i]);
        //System.out.println("result == " + Max);
        int[] age = {2, 6, 16, 54};
        int Max = age[0];
        for (int i:age){
            if (i > age.length) Max = i;
        }
        System.out.println("result == " + Max);
    }
}
