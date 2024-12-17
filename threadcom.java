import java.util.*;
class pc {
    int amt=5000;
    Scanner s = new Scanner(System.in);
    synchronized void consumer() {
        System.out.println("Enter amt to withdraw");
        int draw_amt = s.nextInt();
        System.out.println("Withdrawing Rs: "+draw_amt);
        while(draw_amt>amt) {
            System.out.println("Acc bal low: "+amt);
            System.out.println("bal is less than req, waiting for deposit");
            try {
                wait();
            } catch (Exception e) { }
        }
        System.out.println("Withdraw Complete for Rs: "+draw_amt);
        amt = amt-draw_amt;
    }
    synchronized void producer() {
        System.out.println("Enter deposit amt");
        int dep_amt = s.nextInt();
        System.out.println("\ndepositing process started for Rs "+dep_amt);
        amt = amt+dep_amt;
        System.out.println("Deposit complete for Rs "+dep_amt+"\n");
        notifyAll();
    }
}
public class threadcom {
    public static void main(String[] args) {
        pc obj = new pc();
        new Thread() {
            public void run() {
                obj.consumer();
            }
        }.start();
        new Thread() {
            public void run() {obj.producer();}
        }.start();
    }
}
