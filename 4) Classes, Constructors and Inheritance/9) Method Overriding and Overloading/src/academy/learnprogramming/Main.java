package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dog A = new Dog();
        A.bark();
        A.bark(5); // Bark 5 times.

        GermanShepherd B = new GermanShepherd();
        B.bark();
    }
}


/*
Method Overloading:
Provides functionality to reuse a method name with different parameters.
Usually in a single class but may also be used in a child class.
Must have different parameters.
May have different return types.
May have different access modifiers (private, protected, public).
May throw different exceptions.

-------------------------------------------------------------------------------

Method Overriding:
Used to override a behaviour which the class has inherited from the parent class.
Always in two classes that have a child-parent os IS-A relationship.
Must have the same parameters and same name.
Must have the same return type or covariant return type (child class).
Must NOT have a lower modifier but may have higher modifier.
Must NOT throw a new or broader checked exception.
 */