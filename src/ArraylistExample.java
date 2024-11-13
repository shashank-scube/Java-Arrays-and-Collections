import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistExample {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> list = new ArrayList<>();

        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple"); // Allows duplicates

        System.out.println(list);

        // 2. Inserting an element at a specific position
        list.add(1, "Blueberry");

        System.out.println("After adding Blueberry into the list at index 1"+ list);

        // 3. Accessing elements
        System.out.println("Element at index 2: " + list.get(2));

        // 4. Checking if list contains an element
        System.out.println("Contains 'Banana': " + list.contains("Banana"));

        // 5. Updating an element
        System.out.println("Before Updating the list"+ list);
        list.set(2, "Cantaloupe");
        System.out.println("After Updating the list"+ list);

        // 6. Removing an element by value
        System.out.println("Before Removing the list"+ list);
        list.remove("Apple");
        System.out.println("After Removing the list"+ list);

        // 7. Removing an element by index
        System.out.println("Before Removing the list using index "+ list);
        list.remove(1);
        System.out.println("After Removing the list using index "+ list);

        // 8. Sorting the list
        System.out.println("Before sorting"+ list);
        Collections.sort(list);
        System.out.println("After sorting"+ list);

        // 9. Getting the index of an element
        System.out.println("Index of 'Cherry': " + list.indexOf("Cherry"));

        // 10. Iterating over the list
        System.out.println("List elements:");
        for (String item : list) {
            System.out.println(item);
        }

        // 11. Clearing the list
        list.clear();

        // 12. Checking if list is empty
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}

