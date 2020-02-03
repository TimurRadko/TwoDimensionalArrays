package com.timurradko.twoDimensionalArrays.ex6;

public class Ex6 {
    public static void main(String[] args) {
        int[][] doubleArray = new int[10][10];
        initDoubleArray(doubleArray);
        printDoubleArray(doubleArray);
    }

    private static void initDoubleArray(int[][] doubleArray) {

        for (int k = doubleArray.length - 1; k >= 0; k--) {
            for (int i = k; i < doubleArray.length; i++) {
                doubleArray[i][k] = i - k + 1;
                for (int j = k; j < doubleArray.length; j++) {
                    doubleArray[k][j] = j - k + 1;
                }
            }
        }
    }

    private static void printDoubleArray(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray.length; j++) {
                System.out.print(doubleArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
