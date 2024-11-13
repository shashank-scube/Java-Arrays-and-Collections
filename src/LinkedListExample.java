import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Fox");

        // 2. Adding elements at the beginning and end

        linkedList.addFirst("Ant");
        linkedList.addLast("Goat");


        // 3. Accessing elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // 4. Removing the first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();

        // 5. Checking if element exists
        System.out.println("Contains 'Dog': " + linkedList.contains("Dog"));

        // 6. Getting element by index
        System.out.println("Element at index 1: " + linkedList.get(1));

        // 7. Updating an element
        linkedList.set(1, "Giraffe");

        // 8. Removing an element by value and index
        linkedList.remove("Dog");
        linkedList.remove(1);

        // 9. Iterating over the LinkedList
        System.out.println("LinkedList elements:");
        for (String item : linkedList) {
            System.out.println(item);
        }

        // 10. Clearing the LinkedList
        linkedList.clear();

        // 11. Checking if the LinkedList is empty
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());
    }
}
