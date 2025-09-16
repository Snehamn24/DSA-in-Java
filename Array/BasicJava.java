//Taking input for the array Elements and Printing them

import java.util.Scanner;

class BasicJava
{
    public static void main(String[] args)
    {
        //Create object for the Scanner class
        Scanner sc= new Scanner(System.in);
        //Take the input for number of elements
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        //Declare an array
        int[] arr = new int[n];

        //Take the input for array elements
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        //Print the array elements
        for(int i=0 ;i<n;i++)
        {
            System.out.println("Element at Position  " + i + " is " + arr[i]);
        }

    }
}