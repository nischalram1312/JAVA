public class nrr_Array
{
    public static void main(String[] args)
    {
      /*  int[] marks = {100, 78, 98, 75};
        System.out.println(marks[0]);
        System.out.println(marks.length);
        String [] students = {"a","b","c","d","e"};-
        System.out.println(students.length);
        System.out.println(students[4]);*/
        //displaying array
        int [] marks = {100,98,99,76,56,78};
        int n = marks.length;
        for(int i=0;i<=n-1;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println("\n");
        for (int i=n-1;i>=0;i--)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println("\n");
        // for each loop
        for(int element: marks)
        {
            System.out.print(element+" ");
        }

    }

}
