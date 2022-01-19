package academy.learnprogramming;

public class Main {

    public static int multiplier = 7; // Without the keyword static here, error would occur

    public static void main(String[] args) {

	    StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

    }

    // Java can't allow static methods to access non-static fields or methods because they don't exist
    // when the static method is called

    // Java however allows static method to access non-static fields or methods in another Class
    // because you have to create an instance of a class in order to do so, hence valid.

    // The restriction is purely on static methods accessing non-static fields or methods in its own Class
    public static int multiply(int number) { // Without the keyword static here, error would occur
        return number * multiplier;
    }
}
