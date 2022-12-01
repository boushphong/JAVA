package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue; // Copy the value of 10 to the new variable (This doesn't reference to the same object in memory)
        anotherIntValue = 20;
        System.out.println("myIntValue = " + myIntValue + ", anotherIntValue = " + anotherIntValue);

        String myStringValue = "hello";
        String anotherStringValue = myStringValue; // only reference to the value. not memory address
        myStringValue = "Fred";
        System.out.println("myStringValue = " + myStringValue + ", anotherStringValue = " + anotherStringValue);

        int[] myArr = new int[5]; // Reference to an address in memory.
        int[] anotherArr = myArr; // Reference to the same object in memory (Classes (Arrays, ...) are reference type)
        System.out.println("myArr = " + Arrays.toString(myArr));
        System.out.println("anotherArr = " + Arrays.toString(anotherArr));
        anotherArr[0] = 3;
        System.out.println("myArr = " + Arrays.toString(myArr));
        System.out.println("anotherArr = " + Arrays.toString(anotherArr));

        anotherArr = new int[] {4,5,6,7,8}; // Create a new object in memory (keywords new) (Now anotherArr and myArr variables are seperated)
        modifyRef(myArr);
        System.out.println("myArr = " + Arrays.toString(myArr));
        System.out.println("anotherArr = " + Arrays.toString(anotherArr));

    }

    private static void modifyRef(int[] array) {
        array[0] = 2;
    }
}