package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        // nextInt converts input text into integer
        int yearOfBirth = scanner.nextInt();

        scanner.nextLine(); // This line handles next line character (enter key)
        // Scanner is checking for a line separator, Enter key is treated as a line separator and is treated as an input
        // if the line above is commented, the name will become the "Enter Key"

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2022 - yearOfBirth;

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        scanner.close();
    }
}