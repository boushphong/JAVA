package academy.learnprogramming;

// Main Class
public class Main {

    // Main Method
    public static void main(String[] args) {
	    House blueHouse = new House("Blue"); // Create a new instance of the House Class
        House anotherHouse = blueHouse; // Create a reference to the same object in memory. (2 references pointing to the same object in memory)

        System.out.println(blueHouse.getColor()); // blue
        System.out.println(anotherHouse.getColor()); // blue

        anotherHouse.setColor("yellow");
        System.out.println(blueHouse.getColor()); // yellow
        System.out.println(anotherHouse.getColor()); // yellow

        House greenHouse = new House("green");
        anotherHouse = greenHouse; // This variable no longer references to the blueHouse object.

        System.out.println(blueHouse.getColor()); // still yellow
        System.out.println(greenHouse.getColor()); // green
        System.out.println(anotherHouse.getColor()); // green

        anotherHouse.setColor("Red");

        System.out.println(blueHouse.getColor()); // still yellow
        System.out.println(greenHouse.getColor()); // Red
        System.out.println(anotherHouse.getColor()); // Red
    }
}
