import java.util.Arrays;

public class sampleArray {
    public static void main(String[] args) {

        // Declaring and Initializing an array
        String[] names={"Ram","Mohan","Prasad","Vinay"};

        //Printing a array values using loop
        for (int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }

        // 3. Traversing an Array using For Loop to find the index number of the names
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]+" is placed in the index "+ i );
        }
        //modifying Array Element
        System.out.println(Arrays.toString(names) + "Before Modifying");

        names[0]="Ravan";
        System.out.println(Arrays.toString(names) + "After Modifying");

    }
}
