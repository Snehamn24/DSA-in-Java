import java.util.ArrayList;

class insertion_arraylist
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        //inserting the elements
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println(arr);

        //adding the element put its at the end
        arr.add(40);

        //adding at the beggining : add(pos,ele) 
        arr.add(0,5);

        //adding 15 at position 1
        arr.add(1,15);

        System.out.println(arr);
    }
}