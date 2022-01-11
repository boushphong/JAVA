package academy.learnprogramming;

class Calculator {
    public static void printSum(int a, int b) {
        System.out.println("sum = " + (a + b));
    }
}
/*
Static methods are declared using a static modifier.
Static methods can't access instance methods and instance variables directly
They are usually act as utility functions and don't require any data from an instance of the class (from 'this')
In static methods, we can't use the 'this' keyword.
*/

class Dog {
    public void bark() {
        System.out.println("woof");
    }
}

public class Main {

    public static void main(String[] args) {
	    Calculator.printSum(5, 10);
        printHello();

        System.out.println("Instance methods: ");

        Dog A = new Dog();
        A.bark(); // this is an instance method. (Attached specific to the Dog class)
    }

    public static void printHello() {
        System.out.println("Hello mate");
    }
}
