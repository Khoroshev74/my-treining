package org.example;

import java.util.Arrays;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(removeLocalMaxima));
    }
    public static int[] removeLocalMaxima(int[] array){
        int[] array2 = new int[array.length - 1];
        for (int i = 1; i < array.length; i++){
            if (array[i-1] >= array[i] || array[i] <= array[i+1]){
                Arrays.fill(array2, array[i]);

            }
        }
        return array2;

    }
}
