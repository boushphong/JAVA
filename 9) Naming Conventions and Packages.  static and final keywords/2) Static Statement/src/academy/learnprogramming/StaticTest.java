package academy.learnprogramming;

public class StaticTest {
    // adding static here make all the objects created from the class StaticTest share the same numInstances variable
    private static int numInstances = 0;
    private String name;

    // increment the numInstances by 1 everytime an object is created from StaticTest
    public StaticTest(String name) {
        this.name = name;
        this.numInstances++;
    }

    // if you use a method that only works on static field, it makes sense to make that method static
    // this will make your static field accessible by the Class StaticTest without the usage of
    // class object (instances) that are created from the Class StaticTest
    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
