import java.util.Scanner;
import java.util.Arrays;


class binary_search_recursion
{   
    int binary_search(int[] arr,int low,int high,int key)
    {
        if(low<=high)
        {
        int mid = (low+high)/2;
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(key<arr[mid]){
          
          return binary_search(arr,low,mid-1,key); //left search
        }
        else
        {
            return binary_search(arr,mid+1,high,key); //right search
        }
    }
    return -1;
        
    }

    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};
        int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("The given array is " + Arrays.toString(arr));
        

        System.out.println("Enter the Key element to be searched : ");
        int key = sc.nextInt();

        //creating the object for the function
        binary_search_recursion b = new binary_search_recursion();

        int pos = b.binary_search(arr,0,n-1,key);
        if(pos!=-1)
        {
            System.out.println("Element found at : " + pos);

        }
        else
        {
            System.out.println("Element not found");
        }
        
    }
}