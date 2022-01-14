package academy.learnprogramming;

// Common methods to be implemented in different ways for different class -> interface

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
