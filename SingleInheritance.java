class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void message() {
        System.out.println("Hello from Child");
    }
}

public class SingleInheritance{
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();   // Parent method
        c.message(); // Child method
    }
}

