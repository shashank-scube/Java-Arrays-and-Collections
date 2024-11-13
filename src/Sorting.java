import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        // Declaring and Initializing an Array
        int[] numbers = {5, 2, 9, 1, 5, 6};
        System.out.println("Array elements before sorting:" + Arrays.toString(numbers));
        //sorting a array using loop
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Array elements after sorting : " +Arrays.toString(numbers));

        // sorting a array using inbuild function

        int [] numbers2={70,30,40,20,60,10};
        System.out.println("Array elements before sorting: " + Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println("Array elements after sorting : " + Arrays.toString(numbers2));

    }
}
