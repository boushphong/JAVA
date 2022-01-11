package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions); // Dimensions class within the Case's instance variable

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(1920, 1080)); // Resolution class within the Monitor's instance variable

        Motherboard theMotherboard = new Motherboard("AF-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard); // All the subclasses as instance variables within the PC Class

        thePC.getMonitor().drawPixelAt(1500, 1200, "red"); // Get the monitor class within The PC's instance variable then use its method
        thePC.getMotherboard().loadProgram("Windows 10.0"); // Get the motherboard class within The PC's instance variable then use its method
        thePC.getTheCase().pressPowerButton(); // Get the case class within The PC's instance variable then use its method
    }
}
