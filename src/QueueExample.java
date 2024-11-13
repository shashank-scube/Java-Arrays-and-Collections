import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // 1. Creating a Queue
        Queue<String> queue = new LinkedList<>();

        // 2. Adding elements to the queue (using offer() and add())
        queue.add("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        queue.add("Date");

        System.out.println("Initial Queue: " + queue);

        // 3. Peeking the first element (without removing it)
        System.out.println("Peek first element: " + queue.peek());

        // 4. Removing elements (using poll() and remove())
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // 5. Removing the first element (using remove() throws exception if empty)
        System.out.println("Removed element using remove: " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        // 6. Checking the size of the queue
        System.out.println("Size of Queue: " + queue.size());

        // 7. Checking if the queue is empty
        System.out.println("Is the Queue empty? " + queue.isEmpty());

        // 8. Iterating over the elements in the queue (not possible directly, so convert to Array)
        System.out.println("Iterating over the queue:");
        for (String item : queue) {
            System.out.println(item);
        }

        // 9. Clearing all elements from the queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);

        // 10. Checking if the queue is empty after clearing
        System.out.println("Is the Queue empty now? " + queue.isEmpty());
    }
}

