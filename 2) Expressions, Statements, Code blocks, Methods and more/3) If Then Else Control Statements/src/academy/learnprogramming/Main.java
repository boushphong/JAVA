package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000)
            System.out.println("Your score was 5000");

        if (score > 5000) {
            System.out.println("Your score is larger than 5000");
        } else if (score < 5000) {
            System.out.println("Your score is not larger than 5000");
        } else {
            System.out.println("Your score is equal to 5000");
        }

        // Code Block Access in If Else Control Statement
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // finalScore variable was created inside the if code block above. (inside the curly braces {})
        // Hence finalScore cannot be accessed outside the code block above
        // Variable inside code blocks are concepts called scope
        // Hence this following statement will throw an error:
        // int savedFinalScore = finalScore
    }
}
