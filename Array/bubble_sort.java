/*Bubble sort is one of the sorting technique -a. where we compare the adjacent elements and move the largest 
element at the end of the array
b.during the next part we ignore the sorted element and then we compare the adjacent elements in the unsorted part
untill it is sorted
c.Time complexity - >O(n^2)
d . Total Comparisons 
(n-1)+(n-2)+(n-3)+....+2+1
-> sum of first (n-1) numbers is = n(n-1)/2 this simplifies to O(n^2) 
 */

 import java.util.Scanner;

 class bubble_sort
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("The given array is ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
        //Bubble sort 

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //Print the sorted array
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }


    }
 }