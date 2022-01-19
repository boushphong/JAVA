package academy.learnprogramming;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1; // Scope Check variable

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for (int i=0; i<10; i++) {
            System.out.println(i + " times two is " + i * privateVar);
        }
    }

    public void userInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("privateVar from outer class: " + innerClass.privateVar); // The outer class (ScopeCheck)
        // can use variable defined in the innerClass even when the variable is set to private.
    }

    public class InnerClass {
        private int privateVar = 3; // Inner Class field

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        public void timesThree() {
            ScopeCheck.this.timesTwo();
            for (int i=0; i<10; i++) {
                System.out.println(i + " times three is " + i * this.privateVar); // this.privateVar to use the inner class variable
            }
        }

        public void timesOne() {
            ScopeCheck.this.timesTwo();
            for (int i=0; i<10; i++) {
                System.out.println(i + " times one is " + i * ScopeCheck.this.privateVar); // ScopeCheck.this.privateVar to use the ScopeCheck class variable
            }
        }
    }
}
