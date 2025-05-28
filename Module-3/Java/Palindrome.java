import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the string");
        String st=sc.nextLine();

        StringBuilder sb=new StringBuilder(st);
        for(int i=sb.length()-1;i>=0;i--){
            if(!((Character.isAlphabetic(sb.charAt(i))) || (Character.isDigit(sb.charAt(i) )))){
                sb.deleteCharAt(i);
            }
        }
        String s=sb.toString().toLowerCase();
        if(palindromecheck(s))   System.out.println("the given string "+st+" is a palindrome ");
        else  System.out.println("the given string "+st+" is not a palindrome ");
    }
    public static boolean palindromecheck(String s){
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        return s.equals(ans);
    }

    
}