
package Multithreading;

//copyrigt@gauravchauhan

public class Work implements Runnable {

    @Override
    public synchronized void run() {
        for(int i=0;i<=500;i++){
            System.out.println(" "+i+ "Printed by "+Thread.currentThread());
        }
    }
    
}

class Work2 implements Runnable {

    @Override
    public synchronized void run() {
        for(int i=500;i<=1000;i++){
            System.out.println(" "+i+ "Printed by "+Thread.currentThread());
        }
    }
    
}