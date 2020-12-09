package com.ericghlee.ctci.array;

public class Matrixes {

    // CTCI - Exercise 1.7
    public static void rotate(int[][] matrix) {
        printMatrix(matrix);

        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < matrix.length - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - j][i];
                matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
                matrix[j][matrix.length - 1 - i] = temp;
                printMatrix(matrix);
            }
        }
    }

    // CTCI - Exercise 1.8
    public static void zero(int[][] matrix) {
        boolean[] rowFlags = new boolean[matrix.length];
        boolean[] columnFlags = new boolean[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    rowFlags[i] = true;
                    rowFlags[j] = true;
                }
            }
        }

        for (int i = 0; i < rowFlags.length; i++) {
            if (rowFlags[i]) {
                resetRow(matrix, i);
            }
        }

        for (int i = 0; i < rowFlags.length; i++) {
            if (columnFlags[i]) {
                resetColumn(matrix, i);
            }
        }

    }

    static void resetRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[row][j] = 0;
        }
    }

    static void resetColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;
        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;
        matrix[3][0] = 13;
        matrix[3][1] = 14;
        matrix[3][2] = 15;
        matrix[3][3] = 16;

        rotate(matrix);
    }
}
