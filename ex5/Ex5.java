package com.timurradko.twoDimensionalArrays.ex5;

import java.util.Random;

public class Ex5 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[][] doubleArray = new int[5][5];
        initDoubleArray(doubleArray);
        printArray(doubleArray);
        int[] array = sumArray(doubleArray);
        System.out.println("Array with summed rows:");
        printArray(array);
        int max = maxDiagonalElement(doubleArray);
        System.out.println();
        System.out.println("Maximum diagonal element of array: " + max);

    }

    private static void initDoubleArray(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = random.nextInt(10);
            }
        }
    }

    private static void printArray(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            printArray(doubleArray[i]);
            System.out.println();
        }
    }

    private static int[] sumArray(int[][] doubleArray) {
        int[] newArray = new int[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                newArray[j] = doubleArray[0][j] + doubleArray[doubleArray.length - 1][j];
            }
        }
        return newArray;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + "\t");
        }
    }

    private static int maxDiagonalElement(int[][] doubleArray) {
        int max = doubleArray[0][0];
        for (int i = 0; i < doubleArray.length - 1; i++) {
            if (doubleArray[i][i] < doubleArray[i + 1][i + 1]) {
                max = doubleArray[i + 1][i + 1];
            }
        }
        return max;
    }
}
