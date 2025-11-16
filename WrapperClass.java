public class WrapperClass{
    public static void main(String[] args) {

        System.out.println("--------------- AUTOboxing & UNboxing ---------------");

        int a = 10;
        Integer A = a; // autoboxing
        System.out.println("Autoboxing: " + A);

        Integer B = Integer.valueOf(20); // manual boxing
        int b = B; // unboxing
        System.out.println("Unboxing: " + b);


        System.out.println("\n--------------- Parsing (String → primitive) ---------------");

        int num = Integer.parseInt("123");
        double d = Double.parseDouble("45.67");
        boolean bool = Boolean.parseBoolean("true");

        System.out.println("String to int: " + num);
        System.out.println("String to double: " + d);
        System.out.println("String to boolean: " + bool);


        System.out.println("\n--------------- toString() (primitive → String) ---------------");

        String s1 = Integer.toString(50);
        String s2 = Double.toString(99.99);

        System.out.println("int to String: " + s1);
        System.out.println("double to String: " + s2);


        System.out.println("\n--------------- == vs equals() (Integer Cache) ---------------");

        Integer x1 = 100; // inside cache (-128 to 127)
        Integer x2 = 100;
        System.out.println("100 == 100: " + (x1 == x2)); // true
        System.out.println("100 equals 100: " + x1.equals(x2)); // true

        Integer y1 = 200; // outside cache
        Integer y2 = 200;
        System.out.println("200 == 200: " + (y1 == y2)); // false
        System.out.println("200 equals 200: " + y1.equals(y2)); // true);


        System.out.println("\n--------------- Integer Methods ---------------");

        System.out.println("Max: " + Integer.max(10, 20));
        System.out.println("Min: " + Integer.min(10, 20));
        System.out.println("Compare(5,3): " + Integer.compare(5, 3));
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);


        System.out.println("\n--------------- Double & Float Methods ---------------");

        Double D1 = 12.34;
        System.out.println("Double.isInfinite(): " + Double.isInfinite(D1));
        System.out.println("Double.isNaN(): " + Double.isNaN(D1));

        Float F1 = 1.23f;
        System.out.println("Float.MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("Float.MIN_VALUE: " + Float.MIN_VALUE);


        System.out.println("\n--------------- Character Wrapper Methods ---------------");

        char c = 'A';
        System.out.println("isDigit('A'): " + Character.isDigit(c));
        System.out.println("isLetter('A'): " + Character.isLetter(c));
        System.out.println("isUpperCase('A'): " + Character.isUpperCase(c));
        System.out.println("toLowerCase('A'): " + Character.toLowerCase(c));


        System.out.println("\n--------------- Boolean Wrapper Methods ---------------");

        Boolean flag = Boolean.valueOf(true);
        System.out.println("Boolean value: " + flag);
        System.out.println("Boolean compare true/false: " + Boolean.compare(true, false));
    }
}

