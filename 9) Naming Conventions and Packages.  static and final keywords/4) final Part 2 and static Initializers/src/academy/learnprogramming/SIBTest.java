package academy.learnprogramming;

// Static initialization block
public class SIBTest {
    public static final String owner;

    // static block is a block which is executed when a Class object (instance) is created
    // static block always executes first when a Class object is created
    // All static blocks will be called in sequence first then the constructor when created
    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
