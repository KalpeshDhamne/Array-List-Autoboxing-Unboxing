package com.company;

import java.util.Scanner;

public class DescSorting {

    private static Scanner scanner = new Scanner(System.in);

    public int[] getArray() {
        System.out.println("Enter total numbers of elements");
        int arrayCapacity = scanner.nextInt();
        int currentElement = 0;
        scanner.nextLine();
        int[] array = new int[arrayCapacity];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array element");
            currentElement = scanner.nextInt();
            if (i == 0) {
                array[i] = currentElement;
            } else {
                array[i] = currentElement;
                for (int j = i; j > 0; j--) {
                    if (array[j] > array[j - 1]) {
                        array[j] = array[j] + array[j - 1];
                        array[j - 1] = array[j] - array[j - 1];
                        array[j] = array[j] - array[j - 1];
                    }
                }
            }
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
