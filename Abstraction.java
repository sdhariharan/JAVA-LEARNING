// Abstract class
abstract class Bank {
    abstract void getInterestRate(); // abstract method, must be implemented by child

    void welcomeMessage() { // normal method
        System.out.println("Welcome to the bank!");
    }
}

// Child class implementing abstract method
class SBI extends Bank {
    @Override
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 5%");
    }
}

class HDFC extends Bank {
    @Override
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 6%");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Bank bank1 = new SBI();
        bank1.welcomeMessage(); // inherited normal method
        bank1.getInterestRate(); // implemented abstract method

        System.out.println();

        Bank bank2 = new HDFC();
        bank2.welcomeMessage();
        bank2.getInterestRate();
    }
}
