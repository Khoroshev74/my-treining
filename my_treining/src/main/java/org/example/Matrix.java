package org.example;

public class Matrix {
    public static void main(String[] args) {
        int [][] oneMatrix = new int[3][3];
        int [][] twoMatrix = new int[3][3];
        int [][] resMatrix = new int[3][3];
        oneMatrix = fillMatrix(oneMatrix);
        twoMatrix = fillMatrix(twoMatrix);
        outputMatrix(oneMatrix);
        System.out.println("++++++++++");
        outputMatrix(twoMatrix);
        //Складываем две матрицы
        for (int i = 0; i < resMatrix.length; i++){
            for (int j = 0; j < resMatrix[i].length; j++){
                resMatrix[i][j] = oneMatrix[i][j] + twoMatrix[i][j];
            }
        }
        System.out.println("===========");
        outputMatrix(resMatrix);


    }
    //Заполняем первые две матрицы, создаем метод fillMatrix
    static int[][] fillMatrix (int tmpMatrix[][]){
        for (int i = 0; i < tmpMatrix.length; i++){
            for (int j = 0; j < tmpMatrix[i].length; j++){
                tmpMatrix[i][j] = (int) (Math.random()*10);
            }
        }
        return tmpMatrix;
    }
    static void outputMatrix (int tmpMatrix[][]){
        for (int i = 0; i < tmpMatrix.length; i++){
            for (int j = 0; j < tmpMatrix[i].length; j++){
                System.out.print(tmpMatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
