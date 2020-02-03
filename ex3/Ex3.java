package com.timurradko.twoDimensionalArrays.ex3;

public class Ex3 {
    public static void main(String[] args) {
        char[][] doubleArray = new char[5][5];
        initTwoDimensionArray(doubleArray);
        printArray(doubleArray);
    }

    private static void initTwoDimensionArray(char[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray.length; j++) {
                if (i == 0 || j == 0 || i == doubleArray.length - 1 || j == doubleArray.length - 1 || (i == 2 && j == 2)) {
                    doubleArray[i][j] = 'o';
                } else {
                    doubleArray[i][j] = '*';
                }
            }
        }
    }

    private static void printArray(char[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray.length; j++) {
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
