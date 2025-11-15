interface Vehicle {
    void start(); // abstract method
    void stop();  // abstract method

    default void honk() { // default method
        System.out.println("Vehicle is honking!");
    }

    static void info() { // static method
        System.out.println("Interface: All vehicles must implement start and stop");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class Interference{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.honk();   // default method
        myCar.stop();
        Vehicle.info(); // static method from interface
    }
}
