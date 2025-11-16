public class StringBuffers {
    public static void main(String[] args) {

        // 1. Creating StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Initial: " + sb);

        // 2. append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 3. insert()
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // 4. replace()
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb);

        // 5. delete()
        sb.delete(6, 10);
        System.out.println("After delete: " + sb);

        // 6. deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // 7. setCharAt()
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);

        // 8. charAt()
        System.out.println("charAt(1): " + sb.charAt(1));

        // 9. length()
        System.out.println("Length: " + sb.length());

        // 10. capacity()
        System.out.println("Capacity: " + sb.capacity());

        // 11. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("After ensureCapacity(50): " + sb.capacity());

        // 12. substring() – this does NOT change original buffer
        String sub = sb.substring(0, 5);
        System.out.println("substring(0,5): " + sub);

        // 13. setLength()
        sb.setLength(4);
        System.out.println("After setLength(4): " + sb);

        // 14. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
