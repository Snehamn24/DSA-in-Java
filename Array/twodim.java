//Take 2d matrix as input from the user and the search element and if its found return the index value
import java.util.*;
class twodim
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and the colums : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        //Declare the array
        int[][] arr = new int[r][c];

        System.out.println("Enter the array elemeents : ");

        //Take the elements input
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Take the element they have to find
        System.out.println("Enter the value of element : ");
        int ele=sc.nextInt();

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {

                if(arr[i][j] == ele)
                {
                    System.out.println(i+" "+j);//we cannot write println(i+j) it will add both
                }
                
            }
        }

        System.out.println("End of the program");
        

    }
}