import java.util.*;
public class StringReversal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String st=sc.nextLine();
       
        System.out.println("the reversed string of "+st +" via for loop is:"+ reverse(st));
        StringBuilder sb=new StringBuilder(st);
        System.out.println("the reversed string of "+st +" via stringbuilder  is:"+ sb.reverse());

    }
    public static String reverse(String st){
        String ans="";
        for(int i=st.length()-1;i>=0;i--){
            ans=ans+st.charAt(i);

        }
        return ans;

    }
    
}