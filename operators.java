public class operators{
    public static void main(String[] args) {

        int a = 10, b = 5;

        System.out.println("----- ARITHMETIC OPERATORS -----");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n----- ASSIGNMENT OPERATORS -----");
        int x = 10;
        x += 5;   // same as x = x + 5
        System.out.println("x += 5 → " + x);

        x -= 3;
        System.out.println("x -= 3 → " + x);

        x *= 2;
        System.out.println("x *= 2 → " + x);

        x /= 4;
        System.out.println("x /= 4 → " + x);

        System.out.println("\n----- RELATIONAL OPERATORS -----");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        System.out.println("\n----- LOGICAL OPERATORS -----");
        boolean p = true, q = false;
        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p     : " + (!p));

        System.out.println("\n----- UNARY OPERATORS -----");
        int y = 10;
        System.out.println("y++ : " + (y++)); // prints 10, then y becomes 11
        System.out.println("++y : " + (++y)); // y becomes 12, then prints 12
        System.out.println("y-- : " + (y--)); // prints 12, then y becomes 11
        System.out.println("--y : " + (--y)); // y becomes 10

        System.out.println("\n----- TERNARY OPERATOR -----");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);

        System.out.println("\n----- BITWISE OPERATORS -----");
        int m = 6;  // 110
        int n = 4;  // 100
        System.out.println("m & n : " + (m & n));   // AND → 100 → 4
        System.out.println("m | n : " + (m | n));   // OR  → 110 → 6
        System.out.println("m ^ n : " + (m ^ n));   // XOR → 010 → 2
        System.out.println("m << 1: " + (m << 1));  // Left shift
        System.out.println("m >> 1: " + (m >> 1));  // Right shift
    }
}

