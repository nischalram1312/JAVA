import com.sun.jdi.event.ExceptionEvent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling {
    public static void main(String[] args) throws IOException {
        //creating a file
        File myFile = new File("Nischal.txt");
        try {
            myFile.createNewFile();
        }
        catch (Exception e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        //writing a file
        try {
            FileWriter fileWriter = new FileWriter("Nischal.txt");
            fileWriter.write("This is our first file from this java course");
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("Cant write");
            e.printStackTrace();
        }
        //Reding a file
        try {
            File myfile = new File("Nischal.txt");
            Scanner sc = new Scanner(myfile);
            String s = sc.nextLine();
            System.out.println(s);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //deleting a file

        File myfile = new File("Nischal.txt");
        if(myfile.delete()){
            System.out.println("I have deleted "+myfile.getName());
        }
        else{
            System.out.println("Could not  delete the  file ");
        }
    }
}
