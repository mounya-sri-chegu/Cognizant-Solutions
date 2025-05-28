import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of elements:");

        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements into the array:");
        for(int i=0;i<n;i++){
            System.out.println("enter the "+i+"th element:");
            a[i]=sc.nextInt();
            
        }
        System.out.println("thee sum of elements in the array are:"+sum(a,n));
        System.out.println("the average of the array elements is:"+average(a,n));

    }
    public static int sum(int[] a,int n){
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans+a[i];
        }
        return ans;

    }
    public static double average(int[] a,int n){
        double avg=0;
        for(int i=0;i<n;i++){
            avg=avg+a[i];

        }
        return avg/n;
    }
    
}
