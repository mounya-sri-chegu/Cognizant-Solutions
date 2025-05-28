import java.util.*;
class InvalidAgeException  extends Exception{
    
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the age:");
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new InvalidAgeException("Age is not valid,it must be 18 or  above");
            }
            System.out.println("the age of the user is :"+age);

        }
       
        catch(InvalidAgeException e){
            System.out.println("Invalid Age exception caught:"+e.getMessage());


        }finally{
            System.out.println("code compilled successfullly");
        }
    }
}