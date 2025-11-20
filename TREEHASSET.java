import java.util.TreeSet;

public class TREEHASSET {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        // add elements (sorted automatically)
        set.add("Hari");
        set.add("Gokul");
        set.add("Praveen");
        set.add("Arjun");

        System.out.println("TreeSet: " + set);

        // size()
        System.out.println("Size: " + set.size());

        // contains()
        System.out.println("Contains Hari? " + set.contains("Hari"));

        // first() & last()
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        // higher() & lower()
        System.out.println("Higher than Gokul: " + set.higher("Gokul"));
        System.out.println("Lower than Gokul: " + set.lower("Gokul"));

        // ceiling() & floor()
        System.out.println("Ceiling(Gokul): " + set.ceiling("Gokul"));
        System.out.println("Floor(Gokul): " + set.floor("Gokul"));

        // pollFirst() & pollLast()
        System.out.println("pollFirst: " + set.pollFirst());
        System.out.println("pollLast: " + set.pollLast());
        System.out.println("After polling: " + set);

        // remove()
        set.remove("Hari");
        System.out.println("After removing Hari: " + set);

        // isEmpty()
        System.out.println("Is empty? " + set.isEmpty());

        // clear()
        set.clear();
        System.out.println("After clear(): " + set);
    }
}

