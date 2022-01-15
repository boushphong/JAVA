package academy.learnprogramming;

// Java Program to Illustrate Concept of Interface

// Interface
// Common methods to be implemented in different ways for different class -> interface
interface Shape2 {

    // Abstract method
    void draw();
    double area();
}

// Class 1
// Helper class
class Rectangle2 implements Shape2 {

    private int length, width;

    // constructor
    Rectangle2(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }

    @Override
    public double area() {
        return (double)(length * width);
    }
}

// Class 2
// Helper class
class Circle2 implements Shape2 {

    double pi = 3.14;
    int radius;

    // constructor
    Circle2(int radius) { this.radius = radius; }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn ");
    }

    @Override
    public double area() {
        return (double)((pi * radius * radius));
    }
}

// Class 3
// Main class
class GFG2 {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating the Object of Rectangle class
        // and using shape interface reference.
        Shape2 rect = new Rectangle2(2, 3);

        System.out.println("Area of rectangle: "
                + rect.area());

        rect.draw();

        // Creating the Objects of circle class
        Shape2 circle = new Circle2(2);

        System.out.println("Area of circle: "
                + circle.area());
    }
}