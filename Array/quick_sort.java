// Steps of Quick Sort:

// 1 . Choose a pivot element (commonly the last element, first element, or middle).

// 2 . Partition the array: place pivot at its correct position, and arrange smaller numbers to its left, larger to its right.

// 3 . Recursively apply the above steps to the left and right subarrays.

// 4 . The base case is when the subarray has 0 or 1 element (already sorted).

/*Time Complexity of Quick Sort

Best Case: O(n log n) → pivot divides array into equal halves.

Average Case: O(n log n) → good pivot selection.

Worst Case: O(n^2) → pivot is always the smallest or largest element (array becomes unbalanced).*/


class quick_sort
{
    static int partition(int[] arr,int low,int high)
    {
        int pivot = arr[high];
        int i =low-1;

        for(int j = low;j<high;j++)
        {
            if(arr[j]<=pivot)
            {
                i+=1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    //Quick sort method
    static void quicksort(int[] arr,int low,int high)
    {
        if(low<=high)
        {
            int pi = partition(arr,low,high);
            
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }

    public static void main(String[] args)
    {
        int[] original_array = {2,5,1,4,3};

        quicksort(original_array,0,original_array.length-1);
        int i =0;
        for(int ele : original_array )
        {
            System.out.println(ele);
            i+=1;
        }

    }
}