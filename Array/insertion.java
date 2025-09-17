import java.util.Scanner;
class function_insertion
{
void insertAtEnd(int[] arr,int ele,int size)
{
   arr[size] = ele;
}

void insertAtPos(int[] arr,int size,int ele,int pos)
{   
    //shifting the elements to the right of the array
    for(int i=size;i>pos;i--)
    {
        arr[i] = arr[i-1];

    }
    arr[pos] = ele;
}

void insertAtBeg(int[] arr,int ele,int size)
{
    //shifting the element to the right
    for(int i=size;i>0;i--)
    {
        arr[i] = arr[i-1];

    }
    arr[0] = ele;
}



void printArray(int arr[],int size)
{
    for(int i=0;i<size;i++)
    {
        System.out.println(arr[i]);
    }
}
}

class insertion
{
    public static void main(String[] args)
    {
        int[] arr = new int[100];
        
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int size = 5;
        //call function to insert the element at the end
        
        function_insertion f1 = new function_insertion();

        f1.insertAtEnd(arr,60,size);
        size++;
        System.out.println("Inserting the element at the end");
        f1.printArray(arr,size);
        
        //inserting at the particular position
        int ele = 15;
        int pos = 1;
     
        System.out.println("Inserting 15 at position 1");
        f1.insertAtPos(arr,size,ele,pos);
        size++;
        f1.printArray(arr,size);

        //inserting at the beginning of the array
        int ele2 = 1;
        System.out.println("Inserting the element 1 at the position 0 ");
        f1.insertAtBeg(arr,ele2,size);
        size++;
        f1.printArray(arr,size);
    }
}