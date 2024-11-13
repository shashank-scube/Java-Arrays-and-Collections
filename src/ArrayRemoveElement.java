public class ArrayRemoveElement {
    public static void main(String[] args) {
        // Original array
        int[] array = {1, 2, 3, 4, 5};
        int elementToRemove = 3;
        int indexToRemove = -1;

        // Find the index of the element to remove
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }

        // If the element is found, shift elements to the left
        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // Optional: Set the last element to a default value (e.g., 0)
            array[array.length - 1] = 0;
        } else {
            System.out.println("Element not found in the array.");
        }

        // Print the modified array
        System.out.print("Array after removal: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
