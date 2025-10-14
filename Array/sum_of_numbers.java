class sum_of_numbers
{
    public static int sum_num(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else{
            return sum_num(n-1)+n;
        }
    }
    
    public static void main(String[] args)
    {
        int n=5;
       // for(int i=1;i<=5;i++)
        //{
          //  System.out.println(sum_num(i)+" ");
        //}
        System.out.println("Sum of upto n : "+ sum_num(n));
    }
}