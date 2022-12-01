package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.model = "Carrera";
//        porsche.engine = "V2"; Error -> private field in Car Class

        System.out.println(porsche.model);
    }
}