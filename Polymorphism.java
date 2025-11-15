class Parent {
    void display() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child Method");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display(); // Child Method
    }
}
