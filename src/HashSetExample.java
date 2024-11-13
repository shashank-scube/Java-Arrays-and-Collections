import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // 1. Creating a HashSet
        Set<String> hashSet = new HashSet<>();

        // 2. Adding elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");

        System.out.println("Initial HashSet: " + hashSet);

        // 3. Adding duplicate elements (won't be added as HashSet doesn't allow duplicates)
        hashSet.add("Apple");
        System.out.println("After adding duplicate 'Apple': " + hashSet);

        // 4. Checking if the HashSet contains an element
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));
        System.out.println("Contains 'Grape': " + hashSet.contains("Grape"));

        // 5. Removing an element
        hashSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + hashSet);

        // 6. Removing an element that doesn’t exist (no effect)
        hashSet.remove("Grape");
        System.out.println("After trying to remove non-existent 'Grape': " + hashSet);

        // 7. Checking the size of the HashSet
        System.out.println("Size of HashSet: " + hashSet.size());

        // 8. Checking if the HashSet is empty
        System.out.println("Is the HashSet empty? " + hashSet.isEmpty());

        // 9. Iterating over elements in the HashSet
        System.out.println("Iterating over elements:");
        for (String item : hashSet) {
            System.out.println(item);
        }

        // 10. Converting HashSet to an Array
        String[] array = hashSet.toArray(new String[0]);
        System.out.println("HashSet as Array:");
        for (String item : array) {
            System.out.println(item);
        }

        // 11. Clearing all elements from the HashSet
        hashSet.clear();
        System.out.println("After clearing, is the HashSet empty? " + hashSet.isEmpty());
    }
}
