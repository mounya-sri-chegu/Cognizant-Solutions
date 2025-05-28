import java.util.*;
public class DynamicArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
       System.out.println(" enter the names into arraylist:");
        while(true){
            
            String res=sc.nextLine();
            if(res.equals("end")){
                break;
            }
            arr.add(res);
        }
        System.out.println("names in arraylist are:");

        for(String s:arr){
            System.out.println(s);
        }


    }
    
}