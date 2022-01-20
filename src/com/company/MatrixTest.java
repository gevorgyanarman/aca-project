package com.company;

public class MatrixTest {

    public static void main(String[] args) {

        System.out.println("123456");
        System.out.print("**");
        System.out.print("123456");
        System.out.println();

        if (true) {
            return;
        }

        int matrix[][] = new int[3][3];

        matrix[0][1] = 5;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
