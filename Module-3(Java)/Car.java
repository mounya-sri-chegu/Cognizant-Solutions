
public class Car {
     String model;
        String make;
        int year;
    public static void main(String[] args){
        Car obj=new Car();
        obj.model="Model 3";
        obj.make="Tesla";
        obj.year=2023;

        Car obj2=new Car();
        obj2.model="Model 6";
        obj2.make="Toyoto";
        obj2.year=2020;

        System.out.println("first object details:");
        obj.displayDetails();
        System.out.println("second object details:");
        obj2.displayDetails();

    }
    public  void displayDetails(){
        System.out.println("the model of the car is:"+make);
        System.out.println("the make of the car is:"+model);
        System.out.println("the year of the car is:"+year);
    }
    
}