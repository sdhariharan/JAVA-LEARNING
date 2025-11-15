class Car {
    String color;
    String model;
    int year;

    void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

public class ClassObject{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Toyota Corolla";
        car1.color = "Red";
        car1.year = 2022;

        Car car2 = new Car();
        car2.model = "Honda Civic";
        car2.color = "Blue";
        car2.year = 2023;

        car1.displayInfo();
        System.out.println();
        car2.displayInfo();
    }
}

