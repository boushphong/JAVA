package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345",
                0.00,
                "Bob Brown",
                "myemail@bob.com",
                "(087) 123-4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        // Empty Constructor Called
        Account phongsAccount = new Account();

        System.out.println(phongsAccount.getNumber());
        System.out.println(phongsAccount.getBalance());

        phongsAccount.withdrawal(100.0);

        phongsAccount.deposit(50.0);
        phongsAccount.withdrawal(100.0);

        phongsAccount.deposit(51.0);
        phongsAccount.withdrawal(100.0);
    }
}
