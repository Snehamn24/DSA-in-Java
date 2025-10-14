class basics
{
    public static void main(String[] args)
    {
        //Method 1 of creating the String using the String Literal
        String str1 = "Java";
        System.out.println(str1);

        String str2 = "Java";
        System.out.println(str2);

        //Method 2 - using the new keyword(Heap memory)
        String str3 = new String("Java");
        System.out.println(str3);

        System.out.println(str1==str2);
        System.out.println(str1==str3);


    }
}