package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);

        for (int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The average of the array is " + getAverage(myIntegers));

        // Basic Array Operations

	    int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}; // Initialize an array with known elements.
        double[] myDoubleArray = new double[10]; // Initialize an array with unknown elements.

        System.out.println(myIntArray[5]); // Position 5
        System.out.println(myIntArray[0]); // Position 0

        int[] myIntArray2 = new int[10];

        for (int i=0; i<myIntArray2.length; i++) { // myIntArray2.length gives 10 as the result.
            myIntArray2[i] = i * 10; // Setting value for elements in the array with a for loop.
            System.out.println(myIntArray2[i]);
        }

        printArray(myIntArray);

    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] getIntegers (int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt(); // getting input values as elements of the array
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) (sum/array.length);
    }
}
