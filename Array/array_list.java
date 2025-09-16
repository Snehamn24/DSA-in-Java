import java.util.ArrayList;

class array_list
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        //Input the elements for the array using add()

        arr.add(100);
        arr.add(200);
        arr.add(300);

        //Print the array elements method 1
        System.out.println(arr);

        //printing array elements method 2
        for(int ele : arr)
        {
            System.out.println(ele);
        }

        //Printing array elements method 3

        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }

    }
}