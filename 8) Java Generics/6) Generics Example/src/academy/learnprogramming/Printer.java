package academy.learnprogramming;

// public class Printer<T extends Animal> <- Only take in Object Class that's an extension of the Animal Class
// or Animal Interface (Syntax is still extends instead of 'implement')

// public class Printer<T extends Animal & Serializable> <- Multiple bounds
// T extends both the Animal Class and the Serializable interface (Always list the class first then the interface)

// This is Called bounded Generics

public class Printer<T> {
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
