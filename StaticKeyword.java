class Example {
    static int count = 0;

    static void count() {
        count++;
    }

    static void showCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Example.count();
        Example.count();
        Example.count();
        Example.showCount(); // Access static method without object
        System.out.println(Example.count); // Access static variable
    }
}
