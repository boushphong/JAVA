package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList items = new ArrayList(); // Raw type ArrayList (No type specified)
        items.add(1);
        items.add(2);
        items.add(3);

        printDoubled(items);

        ArrayList<Integer> itemsInInteger = new ArrayList<>(); // Type checking
        itemsInInteger.add(1);
        itemsInInteger.add(2);
        itemsInInteger.add(3);

        printDoubledIntegers(itemsInInteger);
    }

    private static void printDoubled(ArrayList n) {
        for(Object i : n) {
            System.out.println((Integer) i * 2); // Cast as Integer
        }
    }

    private static void printDoubledIntegers(ArrayList<Integer> n) {
        for(Object i : n) {
            System.out.println((Integer) i * 5);
        }
    }
}
