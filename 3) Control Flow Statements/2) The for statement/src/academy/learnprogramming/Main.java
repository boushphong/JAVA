package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // init value, termination condition, increment rule
        for (int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }

        // working backward
        for (int i = 8; i >= 2; i-=2) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
