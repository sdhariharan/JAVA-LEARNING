import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String (one word)
        System.out.print("Enter your first name: ");
        String firstName = sc.next();

        sc.nextLine();  // Clear leftover newline before nextLine()

        // String (full line)
        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        // Integer
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Double
        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        // Float
        System.out.print("Enter today's temperature: ");
        float temperature = sc.nextFloat();

        // Long
        System.out.print("Enter your phone number: ");
        long phone = sc.nextLong();

        // Boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        // Character (using charAt)
        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        // Output Section
        System.out.println("\n----- OUTPUT -----");
        System.out.println("First Name  : " + firstName);
        System.out.println("Address     : " + address);
        System.out.println("Age         : " + age);
        System.out.println("Height      : " + height);
        System.out.println("Temperature : " + temperature);
        System.out.println("Phone       : " + phone);
        System.out.println("Is Student  : " + isStudent);
        System.out.println("Grade       : " + grade);

        sc.close();
    }
}

