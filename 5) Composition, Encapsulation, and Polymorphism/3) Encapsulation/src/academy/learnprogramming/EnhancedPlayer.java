package academy.learnprogramming;

public class EnhancedPlayer {

    /* This is encapsulation by making fields private. We are making the class is not accessible, nor the fields within
    the class to any Classes that are outside.
     */

    private String name;
    private int hitPoints = 100; // default parameter for hitPoints when an object is instantiated
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
