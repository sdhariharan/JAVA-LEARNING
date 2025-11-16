class Demo {
    
    // Static Block
    static {
        System.out.println("1. Static Block");
    }
    
    // Initialization Block
    {
        System.out.println("2. Initialization Block");
    }
    
    // Constructor
    Demo() {
        System.out.println("3. Constructor");
    }
}

public class blocks {
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Demo d1 = new Demo();  
        System.out.println("---- Creating second object ----");
        Demo d2 = new Demo();
    }
}

