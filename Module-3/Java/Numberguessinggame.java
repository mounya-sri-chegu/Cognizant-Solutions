import java.util.*;
public class Numberguessinggame {
    public static void main(String[] args){
    Random random=new Random();
    int num=random.nextInt(100)+1;
   // System.out.println("random number is"+num);
    while(true){
        Scanner sc=new Scanner(System.in);
        System.out.println("guess the number i between 1 to 100:");
        int guess=sc.nextInt();
        if(num<guess){
            System.out.println("Guessed number is higher than random number");

        }else if(num>guess){
            System.out.println("Guessed number is lesser than random number");
        }
        else if(num==guess){
            System.out.println("Guseed number is correct");
            return;
        }
    }
    
}
}