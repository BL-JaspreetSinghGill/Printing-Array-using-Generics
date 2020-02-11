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

    private static <T> void toPrint(T[] array) {
        for (T i: array) {
            System.out.println(i);
        }
    }
}
