package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Shape A = new Shape(5,3);
        System.out.println(A.getX());
        System.out.println(A.getY());

        Rectangle B = new Rectangle(6, 7, 9, 19);
        System.out.println(B.getX());
        System.out.println(B.getY());

        System.out.println(B.getWidth());
        System.out.println(B.getHeight());

        Rectangle C = new Rectangle(6, 7);
        System.out.println(C.getX());
        System.out.println(C.getY());

        System.out.println(C.getWidth());
        System.out.println(C.getHeight());
    }
}