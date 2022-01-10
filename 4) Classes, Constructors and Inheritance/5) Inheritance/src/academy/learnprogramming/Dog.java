package academy.learnprogramming;

// Inherit the Animal Class
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Since we inherit the brain and body from Animal class as the default parameters.
    // Adding them to the constructor is redundant.
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // 1 brain and 1 body as default parameters
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void jump() {
        super.jump();
    }

    public void wag() {
        System.out.println("Wagging tail");
    }
}
