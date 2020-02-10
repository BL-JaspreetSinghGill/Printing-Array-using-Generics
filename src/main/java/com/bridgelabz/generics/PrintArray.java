package com.bridgelabz.generics;

public class PrintArray {
    public static void main(String[] args) {
        Integer integerArray[] = {1, 2, 3};
        Double doubleArray[] = {1.1, 2.2, 3.3};
        Character characterArray[] = {'a', 'b', 'c'};

        toPrint(integerArray);
        toPrint(doubleArray);
        toPrint(characterArray);
    }

    private static void toPrint(Integer[] array) {
        for (Integer i: array) {
            System.out.println(i);
        }
    }

    private static void toPrint(Double[] array) {
        for (Double i: array) {
            System.out.println(i);
        }
    }

    private static void toPrint(Character[] array) {
        for (Character i: array) {
            System.out.println(i);
        }
    }
}
