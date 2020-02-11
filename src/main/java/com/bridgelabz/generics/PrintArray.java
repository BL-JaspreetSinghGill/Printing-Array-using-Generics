package com.bridgelabz.generics;

public class PrintArray<X, Y, Z> {

    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;

    public PrintArray(X[] myXArray, Y[] myYArray, Z[] myZArray) {
        this.myXArray = myXArray;
        this.myYArray = myYArray;
        this.myZArray = myZArray;
    }

    public static void main(String[] args) {
        Integer integerArray[] = {1, 2, 3};
        Double doubleArray[] = {1.1, 2.2, 3.3};
        Character characterArray[] = {'a', 'b', 'c'};

        new PrintArray<Integer, Double, Character>(integerArray, doubleArray, characterArray).toPrint();
    }

    private <T> void toPrint() {
        toPrint(myXArray);
        toPrint(myYArray);
        toPrint(myZArray);
    }

    private static <T> void toPrint(T[] array) {
        for (T i: array) {
            System.out.println(i);
        }
    }
}
