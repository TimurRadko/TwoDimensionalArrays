package com.timurradko.twoDimensionalArrays.ex2;

public class Ex2TwoArray {
    public static void main(String[] args) {
        char[][] doubleArray = new char[5][5];
        initTwoDimensionArray(doubleArray);
        printArray(doubleArray);
    }
    private static void initTwoDimensionArray(char[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray.length; j++) {
                doubleArray[i][j] = '*';
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


