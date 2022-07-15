package Nischal.company;
public class nrr_array_practiceProblem1 {
    public static void main(String[] args)
    {
        float[] marks = {100.0f, 98.5f, 86.75f, 89.25f, 75.0f};
        float number = 98.5f;
        boolean isInArray = false;
        for(float element:marks)
        {
            if(number==element)
            {
                isInArray=true;
                break;
            }
        }
        if(isInArray)
        {
            System.out.println("it is present");
        }
        else
        {
            System.out.println("not present");
        }
    }
}

