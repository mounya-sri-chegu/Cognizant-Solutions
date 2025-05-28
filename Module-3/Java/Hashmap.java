import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the key value pairs into the hashmap:");

        while(true){
            System.out.println("enter the rollnumber:");
            int rno=sc.nextInt();
            sc.nextLine();
            if(rno==-999){
                break;
            }
            System.out.println("enter the name:");
            String name=sc.nextLine();
            hm.put(rno,name);
        }
        System.out.println("The contents in the hashmap are:");
        for(int i:hm.keySet()){
            System.out.println(hm.get(i));
        }

    }
    
}