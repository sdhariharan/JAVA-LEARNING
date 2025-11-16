public class StringMethods{
    public static void main(String[] args) {

        String s = "Hello Java";

        // 1. length()
        System.out.println("Length: " + s.length());

        // 2. charAt()
        System.out.println("Character at index 1: " + s.charAt(1));

        // 3. substring()
        System.out.println("Substring from index 6: " + s.substring(6));
        System.out.println("Substring 0 to 5: " + s.substring(0, 5));

        // 4. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        // 5. contains()
        System.out.println("Contains 'Java'? " + s.contains("Java"));

        // 6. indexOf()
        System.out.println("Index of 'J': " + s.indexOf('J'));

        // 7. equals() and equalsIgnoreCase()
        String s2 = "hello java";
        System.out.println("equals: " + s.equals(s2));
        System.out.println("equalsIgnoreCase: " + s.equalsIgnoreCase(s2));

        // 8. startsWith() and endsWith()
        System.out.println("Starts with 'He'? " + s.startsWith("He"));
        System.out.println("Ends with 'ava'? " + s.endsWith("ava"));

        // 9. replace()
        System.out.println("Replace 'a' with 'o': " + s.replace('a', 'o'));

        // 10. split()
        String[] parts = s.split(" ");
        System.out.println("Splitting words:");
        for (String p : parts) {
            System.out.println(p);
        }

        // 11. trim()
        String s3 = "   Hari   ";
        System.out.println("Before trim: '" + s3 + "'");
        System.out.println("After trim: '" + s3.trim() + "'");
    }
}

