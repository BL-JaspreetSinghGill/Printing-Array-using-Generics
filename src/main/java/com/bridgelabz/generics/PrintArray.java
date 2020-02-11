package com.bridgelabz.generics;

public class PrintArray<E> {

    E[] myArray;

    public PrintArray(E[] myArray) {
        this.myArray = myArray;
    }

    public static void main(String[] args) {
        Integer integerArray[] = {1, 2, 3};
        Double doubleArray[] = {1.1, 2.2, 3.3};
        Character characterArray[] = {'a', 'b', 'c'};

        new PrintArray<Integer>(integerArray).toPrint();
        new PrintArray<Double>(doubleArray).toPrint();
        new PrintArray<Character>(characterArray).toPrint();
    }

    private <T> void toPrint() {
        toPrint(myArray);
    }

    private static <T> void toPrint(T[] array) {
        for (T i: array) {
            System.out.println(i);
        }
    }
}
