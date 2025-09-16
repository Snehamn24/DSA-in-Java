class Student
{
    int regno;
    String name;

    Student(int regno,String name)
    {
        this.regno = regno;
        this.name = name;
    }
}

class array_of_objects
{
    public static void main(String[] args)
    {
        //creating a references for 3 objects
        Student[] arr = new Student[3];

        //has to be intitalised separately
        arr[0] = new Student(1 , "Ron");
        arr[1] = new Student(2 ,"Harmonie");
        arr[2] = new Student(3 ,"Harry");

        //printing the student details
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].regno  + " " + arr[i].name);
        }
    }
}