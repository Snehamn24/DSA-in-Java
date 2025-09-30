/*Algorithm Steps

1 . Start with the second element (since the first element is already “sorted”).

2 . Compare the current element (key) with elements in the sorted part of the array.

3 . Shift all elements greater than the key one position to the right.

4 . Insert the key at its correct position.

5 . Repeat until the whole array is sorted.
Time Complexity
Best Case: O(n)

Worst Case: O(n²)

Average Case: O(n²)
*/

class insertion_sort
{
    public static void main(String[] args)
    {
        int[] arr = {5,2,4,6,1};

        System.out.println("The unsorted array is : ");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        //insertion sort logic
        for(int i=1;i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j = j-1;

            }
            arr[j+1] = key;
        }
        System.out.println();

        System.out.println("Sorted Array is : ");
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }
}