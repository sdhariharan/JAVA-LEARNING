class Car {
    String color;
    String model;
    int year;

    Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

public class ConstructorinClass{
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Corolla", "Red", 2022);
        Car car2 = new Car("Honda Civic", "Blue", 2023);

        car1.displayInfo();
        System.out.println();
        car2.displayInfo();
    }
}

