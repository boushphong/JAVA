package academy.learnprogramming;

public class SomeClass {

    private static int classCounter = 0; // increment by 1 everytime a Class Instance was created from the Class
    private final int instanceNumber;
    private final String name;


    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter; // each Class Instance will have a fixed instanceNumber since it was declared final
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public static int getClassCounter() {
        return classCounter;
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
