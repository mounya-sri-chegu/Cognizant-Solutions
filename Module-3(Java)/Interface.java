interface Playable{
    public void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("plays a guitar sound");
    }
}
class Piano implements Playable{
    public void play(){
        System.out.println("plays a piano sound");
    }
}
public class Interface {
    public static void main(String[] args){
        Guitar g=new Guitar();
        Piano p=new Piano();
        g.play();
        p.play();
    }
    
}