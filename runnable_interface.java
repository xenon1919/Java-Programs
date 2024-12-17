class newthread implements Runnable {
    Thread t;
    newthread() {
        t=new Thread(this, "Thread Demo");
        System.out.println("Child thread "+t);
        t.start();
    }
    public void run() {
        try {
            for(int i=5;i>0;i--) {
                System.out.println("Child thread "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e) {
        System.out.println("Child thread interrupted");
         }
    System.out.println("Child thread exited");
}
}
public class runnable_interface {
    public static void main(String[] args) {
        new newthread();
        try {
            for(int i=5;i>0;i--) {
                System.out.println("Main thread "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
    
}
