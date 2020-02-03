package com.timurradko.twoDimensionalArrays.ex1;

import java.util.Random;

public class Ex1TwoArray {
    private static Random random = new Random();

    public static void main(String[] args) {
        int n = 5;
        int[][] doubleArray = new int[5][5];
        initRandomDoubleArray(doubleArray);
        printArray(doubleArray);

    }

    private static void initRandomDoubleArray(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] =random.nextInt(10);
            }
        }
    }

    private static void printArray(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray.length; j++) {
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
