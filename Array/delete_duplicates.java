import java.util.Arrays;
import java.util.HashSet;

public class delete_duplicates{
    public static int[] removeDuplicatesUsingSet(int[] arr)
    {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for(int ele : arr)
        {
            uniqueElements.add(ele);
        }

        //converting the hashset back to the the array
        int[] uniqueArray = new int[uniqueElements.size()];
        int i=0;
        for(int element : uniqueElements)
        {
            uniqueArray[i++] = element;
        }
        return uniqueArray;


    }

    public static void main(String[] args)
    {
        int[] original_array = {1,2,2,3,4,4,4,5,5};//taking original array
        int[] unique_array = removeDuplicatesUsingSet(original_array);//calling function
        System.out.println(Arrays.toString(unique_array));
    }
}