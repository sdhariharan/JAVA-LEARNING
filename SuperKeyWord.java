class Parent{
    int num = 100;

    Parent() {
        System.out.println("Parent Constructor");
    }

    void display() {
        System.out.println("Parent method: num = " + num);
    }
}

class Child extends Parent {
    int num = 200;

    Child() {
        super(); // Calls parent constructor
        System.out.println("Child Constructor");
    }

    void display() {
        System.out.println("Child method: num = " + num);
        super.display(); // Calls parent method
    }

    void show() {
        System.out.println("Child's num: " + num);       // Child variable
        System.out.println("Parent's num: " + super.num); // Parent variable
    }
}

public class SuperKeyWord{
    public static void main(String[] args) {
        Child c = new Child();

        System.out.println();

        c.display(); // Shows method overriding + super.method()

        System.out.println();

        c.show(); // Shows parent vs child variables using super.variable
    }
}
