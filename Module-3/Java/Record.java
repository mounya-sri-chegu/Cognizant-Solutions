import java.util.*;
import java.util.stream.*;
public class Record {
    public record Person(String name,int age){}
    public static void main(String[] args){
        Person p1=new Person("mounya",24);
        Person p2=new Person("prashanthi",1);
        Person p3=new Person("divya",26);
        Person p4=new Person("thanmai",124);

        List<Person> lt=new ArrayList<>();
        lt.add(p1);
        lt.add(p2);
        lt.add(p3);
        lt.add(p4);

        List<Person> ans=lt.stream().filter(n-> n.age()>20).collect(Collectors.toList());
        for(Person p:ans){
            System.out.println(p);
        }



        
    }

    
}