import java.util.Arrays;

class second_largest
{
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};

        System.out.println("Given array is : ");

        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }

        System.out.println();

        Arrays.sort(arr);

        System.out.println("2nd largest element : " + arr[arr.length - 2]);


    }
}