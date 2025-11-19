import java.util.HashSet;

public class HASSET{
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        // Adding string elements
        names.add("Hari");
        names.add("Kumar");
        names.add("Ravi");
        names.add("Hari");   // duplicate (will NOT be added)

        // Display the set
        System.out.println("Names: " + names);

        // Check element exists or not
        System.out.println("Contains Hari? " + names.contains("Hari"));
        System.out.println("Contains Manoj? " + names.contains("Manoj"));

        // Remove an element
        names.remove("Ravi");
        System.out.println("After removing Ravi: " + names);

        // Size of HashSet
        System.out.println("Size: " + names.size());

        // Loop using iterator
        System.out.print("Looping: ");
        for (String name : names) {
            System.out.print(name + " ");
        }

        // Clear all elements
        names.clear();
        System.out.println("\nAfter clear(): " + names);
    }
}
