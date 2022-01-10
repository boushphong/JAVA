package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // Reserved keywords in JAVA, make sure not to use any keywords in the link:
        // https://en.wikipedia.org/wiki/List_of_Java_keywords
        double kilometres = 100 * 1.609344; // kilometres = 100 * 1.609344 part is an expression
        System.out.println(kilometres);

        // kilometres >= 160 is an expression
        if (kilometres >= 160) {
            System.out.println("KM > 160");
        }
    }
}
