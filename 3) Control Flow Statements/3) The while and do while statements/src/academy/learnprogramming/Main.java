package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        // Other while
        count = 1;
        while (true) {
            if (count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // do while
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 8);

        // do while (Make sure do statement in while loop executes at least one time)
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 20) {
                break;
            }
        } while (count != 6);
    }
}
