package academy.learnprogramming;

class Dog {
    public void bark() {
        System.out.println("woof");
    }

    // Method Overloading (same name, different parameters)
    public void bark(int number) {
        for(int i = 0; i < number; i++) {
            System.out.println("woof");
        }
    }
}

class GermanShepherd extends Dog {

    // Method Overriding (same name, same Parameter) Override the method from parent class
    @Override
    public void bark() {
        System.out.println("woof woof woof");
    }
}