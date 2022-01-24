package com.aca.classroom;

public class ShipBattle {

    public static void main(String[] args) {

        char[][] fields = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                fields[i][j] = '0';
            }
        }

        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        printMatrix(fields);

        char[][] fields2 = addShip(fields, 3, 0);

        System.out.println("AFTER");
        printMatrix(fields);
        //3, 1
        // 0 0 0 0 0
        // 0 0 * 0 0
        // 0 0 * 0 0
        // 0 * * 0 0
        // 0 0 0 0 0
    }

    public static char[][] addShip(char[][] fields, int i, int j) {
        if (j + 4 > fields[i].length) {
            return fields;
        }

        for (int c = j; c < j + 4; c++) {
            fields[i][c] = '*';
        }
        return fields;
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
