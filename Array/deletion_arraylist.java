import java.util.ArrayList;

class deletion_arraylist
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println("Main Array  " + arr);

        //removing using the index 
        arr.remove(2);

        System.out.println("Array after removing the 30 at index 2 " + arr);
        
        //delete by the value
        arr.remove(Integer.valueOf(20));
        System.out.println("Array after removing the element 20 " + arr);
    }
}