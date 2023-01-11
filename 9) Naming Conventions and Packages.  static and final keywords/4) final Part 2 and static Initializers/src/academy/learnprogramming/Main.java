package academy.learnprogramming;

public class Main {

    // Static blocks will be called first then the main method
    static String s = "he";

    public static void main(String[] args) {

        System.out.println("The value for s is " + s); // Will print "he"

        int pw = 674312;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);

        System.out.println("Main method called");
        SIBTest test = new SIBTest(); // Execute static block first then constructor
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
