
package Multithreading;

//copyrigt@gauravchauhan

public class Multithreading {
    
    public static void main(String[] args) throws InterruptedException {
       
    Work w1=new Work();
    Work2 w2=new Work2();
    Thread t1=new Thread(w1);
    t1.start();
    Thread t2=new Thread(w2);
    t1.join();
    t2.start();
    t2.join();
    
    
    }
    

    
}
