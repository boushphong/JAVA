package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

	    int[] myIntegers = getIntegers(5);

        int[] sorted = sortedIntegers(myIntegers);
        printArray(sorted);

        }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + array[i]);
        }
    }

    public static int[] sortedIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//        for (int i=0; i<array.length; i++){
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true; // Only continues the while loop if we set flag to true.
                }
            }
        }
        return sortedArray;
    }
}

//Python code
//
//flag = True
//
//while flag:
//    flag = False
//    for i in range(len(array) - 1):
//        if array[i] < array[i+1]:
//            temp = array[i]
//            array[i] = array[i+1]
//            array[i+1] = temp
//            print(array)
//            flag = True
//
//print(array)