package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        // Using the method. This will jump ahead of the main method code block.
        int score1 = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Score 1: " + score1);

        int score2 = calculateScore(true, 800, levelCompleted, bonus);
        System.out.println("Score 2: " + score2);

        int score3 = new Main().calculateScore(true, 1000, 10, 120);
        System.out.println("Score 3: " + score3);
    }

    // Defining the parameter. and return the result
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
            // We also have to specify return value when gameOver variable isn't true.
        }
        return -1; // same as ... } else {return -1}
    }
}