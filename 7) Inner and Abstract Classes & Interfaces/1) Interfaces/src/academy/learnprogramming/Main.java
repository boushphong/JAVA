package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();

        System.out.println("\nPhong's Phone\n");
        ITelephone phongsPhone = new MobilePhone(834568886);
        phongsPhone.dial(123456);
        System.out.println(phongsPhone.getClass());
    }
}
