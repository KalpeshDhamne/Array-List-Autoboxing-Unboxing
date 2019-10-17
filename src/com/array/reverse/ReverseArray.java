package com.array.reverse;

import java.util.Scanner;

public class ReverseArray {

    public double[] getArray() {
        return array;
    }

    public double[] getReverserArray() {
        return reverserArray;
    }

    private double[] array;
    private double[] reverserArray;
    private static Scanner scanner=new Scanner(System.in);

    public ReverseArray(int arrayLength) {
        getArrayAndReverse(arrayLength);
    }

    private void getArrayAndReverse(int arrayLength) {
        double number;
        double[] array = new double[arrayLength];
        double[] reverseArray = new double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter array element");
            if (scanner.hasNextDouble()) {
                number = scanner.nextInt();
                scanner.nextLine();
                array[i] = number;
                reverseArray[arrayLength - 1 - i] = number;
            } else {
                System.out.println("Enter valid element");
                i--;
                scanner.nextLine();
//                continue;
            }
        }
        this.array = array;
        this.reverserArray = reverseArray;
    }
}
