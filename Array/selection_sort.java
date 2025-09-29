// Sorting Technique - Selection Sort
//
// Step 1: At the beginning of each pass, assume the first unsorted element
//         (at index i) is the smallest.
// Step 2: Compare this element with all the remaining elements in the array.
//         - If a smaller element is found, update the index of the smallest.
// Step 3: After scanning the remaining elements, swap the smallest element
//         with the element at index i.
// Step 4: Repeat until the array is sorted.
//
// Outer loop: Runs (n-1) times (from i = 0 to n-2).
// Inner loop: Runs (n-1) + (n-2) + ... + 1 times.
//             Total comparisons = n(n-1)/2.
//
// Time Complexity:
//   - Best Case: O(n^2)  (because comparisons are always made)
//   - Worst Case: O(n^2)
//   - Average Case: O(n^2)
//
// Space Complexity: O(1) (in-place sorting, only a few variables used).
//
// Note: Selection sort is NOT a stable algorithm (equal elements may lose
//       their relative order after swapping).

import java.util.Scanner;

public class selection_sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");

        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt(); 
        }

        System.out.println("unsorted array elements are : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        //selection sort logic
        for(int i=0;i<n;i++)
        {
            int mini_index = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[mini_index])
                {
                    mini_index = j;
                }

            }
            //swap after finding the min
            int temp = arr[mini_index];
            arr[mini_index] = arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted array elements are : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}