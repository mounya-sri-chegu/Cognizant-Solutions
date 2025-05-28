import java.io.*;
public class FileReading{
    public static void main(String[] args){
        try{
        FileReader fr=new FileReader("output.txt");
        BufferedReader br=new BufferedReader(fr);
        System.out.println("contents of the  output.txt file are:");
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        fr.close();
    }catch(IOException e){
        System.out.println("File IO exception occured:"+e.getMessage());
    }

    }
    
}