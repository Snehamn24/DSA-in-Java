class printing_numbers
{
    public static void printn(int n)
    {
        if(n==0)
        {
            return;//base condition
        }
        printn(n-1);
        System.out.print(n+" ");


    }

    public static void main(String[] args)
    {
        int n =5;
        printn(n);
    }
}