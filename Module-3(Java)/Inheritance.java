 class Animal {
    public void makeSound(){
        System.out.println("Wierd sounds");
    }
}
     class Dog extends Animal{
        public void makeSound(){
            System.out.println("Bark!");

        }
    }
    public class Inheritance{
    
    public static void main(String[] args){
        Animal obj=new Animal();
        Dog obj2=new Dog();
        obj.makeSound();
        obj2.makeSound();
    }
}
    
