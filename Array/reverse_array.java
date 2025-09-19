import java.util.Arrays;
class reverse_array
{
    static void reverseArray(int[] arr)
    {
       int n = arr.length;

       //looping over the array elements and swapping the left to right and vice-versa elements

       for(int i=0;i<n/2;i++)
       {
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1]=temp;
       }
    }

    public static void main(String[] args)
    {
        int[] arr = {1,8,9,6,7};

        System.out.println("Array before reversal : " +Arrays.toString(arr));

        reverseArray(arr);

        //printing the reversed array

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}