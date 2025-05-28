import java.util.*;
import java.io.*;
public class FileWriting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the message to be written into a file");
        String st=sc.nextLine();
        try{
        FileWriter fw=new FileWriter("output.txt");
        fw.write(st);
        fw.close();
        System.out.println("Data has been written into file successfully");
        }
        catch(IOException e){
            
     System.out.println("An error occured while writing to a file"+e.getMessage());
        }
    }
}