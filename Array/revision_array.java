import java.util.*;
class revision_array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        //method 1 of assigning values to the array
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;
        arr[4]=500;

        //Printing the values
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        //taking the size of the array and taking the array elements
        System.out.println("Enter the array size : ");
        int n=sc.nextInt();
        //Take the elements from the loop
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //Displays the array content
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}