//time complexity is O(n) ->worst case , O(1) -> best case
import java.util.Scanner;
class linear_search
{
    public static void main(String[] args)
    {
        int pos = -1;
        Scanner sc = new Scanner(System.in);
        //input the size of the array

        System.out.print("Enter the size of the array : ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        //Take input for the elements
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        //input the key element
        System.out.print("Enter the key element : ");
        int key = sc.nextInt();
        
        //Linear Search
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key){
                pos = i;
                break;
                
            }
        }
        if(pos!=-1)
        {
        System.out.println("The element " + key + " is present  " + " at " + pos);
        }
        else{
            System.out.println("Element found ");
        }

    }
}