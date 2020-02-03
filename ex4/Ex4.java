package com.timurradko.twoDimensionalArrays.ex4;

import java.util.Random;

public class Ex4 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[][] doubleArray = new int[5][5];
        initDoubleRandomArray(doubleArray);
        printArray(doubleArray);
        squaringDoubleArray(doubleArray);
        printArray(doubleArray);
        int[][] newArray = initNewArray(doubleArray);
        printArray(newArray);
        sumDoubleArray(doubleArray, newArray);


    }

    private static void initDoubleRandomArray(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = random.nextInt(10);
            }
        }
    }

    private static void printArray(int[][] doubleArray) {
        System.out.println("Your new array:");
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void squaringDoubleArray(int[][] doubleArray) {
        int value = 1;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                int squaring = doubleArray[i][j] * value;
                doubleArray[i][j] = squaring * doubleArray[i][j];
            }
        }
    }

    private static int[][] initNewArray(int[][] doubleArray) {
        int[][] newArray = new int[doubleArray.length][doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                newArray[i][j] = random.nextInt(10);
            }
        }
        return newArray;
    }

    private static void sumDoubleArray(int[][] doubleArray, int[][] newArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                newArray[i][j] = doubleArray[i][j] + newArray[i][j];
            }
        }
        printArray(newArray);
    }
}
