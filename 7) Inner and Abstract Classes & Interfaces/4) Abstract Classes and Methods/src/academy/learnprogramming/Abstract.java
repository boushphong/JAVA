package academy.learnprogramming;

// An interface assumes all the method inside the interface is abstract (which means unimplemented (no code insde))
interface DogInterface {
    void bark();
    void chase();
}


// An abstract class help make regular classes that you use
// An abstract class help us what that class (in this instance the dog class) should have
abstract class Dog {
    String breed;

    public void bark() {
        System.out.println("woof woof");
    }

    // Abstract method. Abstract method doesn't have to be implemented inside the abstract class
    // but it has to be implemented for every objects that are created from the abstract class
    public abstract void chase();
}

class Boxer implements DogInterface {
    public void bark() {
        System.out.println("Boxer is barking");
    }

    public void chase() {
        System.out.println("Boxer is chasing");
    }
}

class Corgi extends Dog {
    public void chase() {
        System.out.println("Dog is chasing");
    }
}

// Chihuahua class is an extension of the Dog class
class Chihuahua extends Dog {

    @Override
    public void bark() {
        System.out.println("Chihuahua is barking");
    }

    public void chase() {
        System.out.println("Dog is chasing");
    }
}

public class Abstract {

    public static void main(String[] args) {
	    // Dog d = new Dog(); <-- Invalid code. You can't instantiate an object from abstract class unlike regular classes

        Chihuahua chh = new Chihuahua();
        Corgi cg = new Corgi();
        Boxer bx = new Boxer();

        chh.bark(); // Override default abstract method
        cg.bark(); // Use default abstract method
        bx.bark(); // Using the interface
    }
}
