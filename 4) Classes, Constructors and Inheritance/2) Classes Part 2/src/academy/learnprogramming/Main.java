package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	Car porsche = new Car();
        Car holden = new Car();

        // Will return null if model attribute is called before instantiation.
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        // Will return Unknown model since holden 91 model is not in the setModel method.
        holden.setModel("holden 91");
        System.out.println("Model is " + holden.getModel());

    }
}
