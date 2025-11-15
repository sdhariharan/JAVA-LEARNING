class GrandParent {
    void grandGreet() {
        System.out.println("Hello from GrandParent");
    }
}

class Parent extends GrandParent {
    void parentGreet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void childGreet() {
        System.out.println("Hello from Child");
    }
}

public class MultilevelInheritance{
    public static void main(String[] args) {
        Child c = new Child();
        c.grandGreet();
        c.parentGreet();
        c.childGreet();
    }
}
