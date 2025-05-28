class  MyRunnable implements Runnable{
    public void run(){
        try{
            System.out.println("Implemented "+Thread.currentThread().getName());
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("exception caught");
        }
    }
}
public class ThreadCreation {
    public static void main(String[] args){
        Runnable r1=new MyRunnable();
        Runnable r2=new MyRunnable();

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();

    }

    
}