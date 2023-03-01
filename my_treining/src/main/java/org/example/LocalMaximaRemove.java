package org.example;

import java.util.Arrays;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(LocalMaximaRemove.removeLocalMaxima(array))); // static functions always use by class name.
    }
    public static int[] removeLocalMaxima(int[] array) {
        // we don`t know how many elements needs. And previous conditions was wrong.
        // We should just copy previous massive and modify it.
        int[] array2 = array.clone();
        //we need to have counter for iterations in our arrays2(bad naming)
        int j = 0;
        //We need to start with 0 el because we have to check all elements
        //If we will start with 1 el we skip 0 el.
        for (int i = 0; i < array.length; i++) {
            //We need have a conditions for 0el and past el because without it we will have issue with outOfBounds Exceptions
            if (i == 0) {
                if (array[i] <= array[i + 1]) {
                    array2[j] = array[i];
                    j++;
                }
                continue;
            }
            if (i == array.length - 1) {
                if (array[i - 1] >= array[i]) {
                    array2[j] = array[i];
                    j++;
                }
                continue;
            }
            if (array[i - 1] >= array[i] || array[i] <= array[i + 1]) {
                array2[j] = array[i];
                j++;
            }
        }
        //removing all unnecessary elements.
        array2 = Arrays.copyOf(array2, j);
        return array2;
    }
}
