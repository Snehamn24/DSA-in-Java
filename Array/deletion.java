class deletion
{
    int delEnd(int[] arr,int size)
    {
        if(size<=0)
        {
            System.out.println("Array is empty");
            return size;
        }
        
        return size-1;
        

    }
   

    void printArray(int[] arr,int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] main)
    {
        int[] arr = new int[100];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        int size = 3;

        deletion d = new deletion();

        System.out.print("Original array : ");

        d.printArray(arr,size);

        System.out.println("Deleting the element at the end : ");

        d.delEnd(arr,size);
        d.printArray(arr,size);

        

    }
}