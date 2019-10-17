package com.company;

import java.util.Arrays;

public class ReferenceDereference {

    public static void main(String[] args) {
        int firstInt = 10;
        int secondInt = firstInt;//assigning value
        System.out.println(firstInt);
        System.out.println(secondInt);
        firstInt = 20;
        secondInt = 30;
        System.out.println(firstInt);
        System.out.println(secondInt);

        int[] array1 = new int[10];
        int[] array2 = array1; //assigning reference
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        array1[0] = 1;
        array2[1] = 2;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        modifyArray(array2);//referecing
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        array2 = new int[]{10, 20, 30, 40, 50};//derefercing
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

    public static void modifyArray(int[] array) {
        array[2] = 2;
        array = new int[]{1, 2, 3, 4, 5};//derefencing
    }
}
