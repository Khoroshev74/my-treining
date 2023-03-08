package org.example;

public class Spiral {
   public static int[][] spiral(int rows, int cols){
       int [][] array = new int[rows][cols];
       int num = 1, nmax = rows * cols;
       int rmin = 0, rmax = rows -1;
       int cmin = 0, cmax = cols-1;
       while (num < nmax){
           for (int i = cmin; i < cmax && num < nmax; i++) {
               array[rmin][i] = num++;
           }
           rmin++;
           for (int i = rmin; i < rmax && num < nmax; i++){
               array[i][cmax] = num++;
           }
           cmax--;
           for (int i = cmax; i > cmin && num < nmax; i++){
               array[rmax][i] = num;
               num++;
           }
           rmax--;
           for (int i = rmax; i > rmin && num < nmax; i++){
               array[i][cmin] = num;
               num++;
           }
       }
       return array;

   }
}


