class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child1 extends Parent {
    void message1() {
        System.out.println("Hello from Child1");
    }
}

class Child2 extends Parent {
    void message2() {
        System.out.println("Hello from Child2");
    }
}

public class HierarchicalInheritance{
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.greet();
        c1.message1();

        Child2 c2 = new Child2();
        c2.greet();
        c2.message2();
    }
}
