package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        // Generics don't work with Primitive Data Type. Only Object Class
        // Concepts similar to ArrayList<>. You want to control the type of the Array <>. Making the Array type-safe.
        // ArrayList<Object> to just create a list of objects. Hence, making the Array not type-safe.
        Printer<Integer> printer = new Printer<>(23); // Print as Integer
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(23.00); // Print as Double Type
        doublePrinter.print();

        shout("John");
        shout(57);

        multipleShout("John", 67);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.00);
        doubleList.add(6.00);
        printList(doubleList);

    }

    // A generic method that takes in any type of object
    private static <T> void shout (T thingToShout) { // Generics Method
        System.out.println(thingToShout + "!!!!!");
    }

    // A generic method that takes in multiple objects of any type
    // private static <T, V> T instead of void to return also the according type
    private static <T, V> void multipleShout (T thingToShout, V otherThingToShout) { // Generics Method
        System.out.println(thingToShout + "!!!!!");
        System.out.println(otherThingToShout + "!!!!!");
    }

    // ? WildCard. Wildcard as the type parameter when you don't know exactly what the generics type is going to be
    // Takes in the list of anything (Any Object) and print that list
    public static void printList(List<?> myList) {
        System.out.println(myList);
    }
}
