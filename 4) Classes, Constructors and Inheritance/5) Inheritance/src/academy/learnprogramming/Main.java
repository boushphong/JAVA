package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.jump();
        dog.wag();
        dog.bark();

        // Can't be called since the chew method's access modifier is set to private.
        // Dog.chew();
    }
}