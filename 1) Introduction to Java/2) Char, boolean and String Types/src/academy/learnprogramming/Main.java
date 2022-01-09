package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // char type can only store a single character
        char myChar = 'D';

        // According Unicode for letter D
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        // Boolean
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString += ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString += " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        // String type treats all addition operators with another type as textual appendage.
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
    }
}
