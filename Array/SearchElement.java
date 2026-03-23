//Take a array as input from the user and take the element x and search for it and if found print the index 
//otherwise print the appropriate message
import java.util.*;
class SearchElement
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();

        //declare an array and position to store
        int pos=-1;
        int[] arr=new int[n];

        System.out.println("Enter the array elements  ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to be found : ");
        int x = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                
                pos=i;
                break;

            }
            
        }
        if(pos<0)
        {
            System.out.println("Element not found ");
        }
        else
        {
            System.out.println("Element Found at "+pos);
        }
    }
}