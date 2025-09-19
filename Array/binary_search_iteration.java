import java.util.Scanner;
import java.util.Arrays;

class binary_search_iteration
{
    public static void main(String[] args)
    {
        int pos = -1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.print("Enter the key element : ");
        int key = sc.nextInt();

        

       
        int low =0;
        int high = n-1;
         int mid = (low+high)/2;

        for(int i=0;i<n;i++)
        {
            
            if(arr[mid]==key)
            {
                pos = mid;
                break;
            }
            else if(key<arr[mid])
            {
               high = mid-1;
               mid = (low+high)/2;
               continue;
            }
            else{
                 low = mid+1;
                 mid = (low+high)/2;
                 continue;
              }
        }
        if(pos!=-1)
        {
            System.out.println("Element found at " + pos);
        }
        else
        {
            System.out.println("Element not found");
        }
        



    }
}