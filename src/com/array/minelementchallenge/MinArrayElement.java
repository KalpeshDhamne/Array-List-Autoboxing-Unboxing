package com.array.minelementchallenge;

import java.util.Scanner;

public class MinArrayElement {

    private static Scanner scanner = new Scanner(System.in);

    private int minArrayElement;

    public MinArrayElement(int arrayLength) {
        getMinArrayElement(arrayLength);
    }

    public int getMinArrayElement() {
        return this.minArrayElement;
    }

    private void getMinArrayElement(int arrayLength) {
        int currentArrayElement;
        int minArrayElement = 0;
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter array element");
            if (!(scanner.hasNextInt())) {
                System.out.println("Please enter valid number");
                i--;
                scanner.nextLine();
                continue;
            }
            array[i] = scanner.nextInt();
            scanner.nextLine();
            if (i == 0) {
                minArrayElement = array[i];
            } else {
                if (minArrayElement > array[i]) {
                    minArrayElement = array[i];
                }
            }
        }
        this.minArrayElement = minArrayElement;
    }
}
