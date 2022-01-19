package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    String privateVar = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);
        scopeInstance.timesTwo();
        System.out.println("***********************************");
        scopeInstance.userInner(); // Valid call from the outer class

//        // However, this line of code is invalid.
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println("varThree is not accessible here " + innerClass.varThree); <- Cannot find the variable varThree

        System.out.println("***********************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesThree();
        innerClass.timesOne();
    }
}
