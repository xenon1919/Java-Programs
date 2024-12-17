class customer {
    int amt=100;
    synchronized void withdraw(int amt) {
        System.out.println("Withdraw initiated");
        if(this.amt<amt) {
            System.out.println("Less balance, waiting for deposit");
            try {
                wait();
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
    synchronized void deposit(int amt) {
        System.out.println("Deposit initiated");
        this.amt+=amt;
        System.out.println("Deposited successfully");
    }
}
public class IPCmultithread {
    public static void main(String[] args) {
        final customer c = new customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);
        }
    }.start();
    new Thread() {
        public void run() {
            c.deposit(10000);
    }
}.start();
    }
}