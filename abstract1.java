abstract class bike {
    abstract void run();
}
public class abstract1 extends bike{
    public void run() {
        System.out.println("I am running");
    }
    public static void main(String args[]) {
        
        bike obj = new abstract1();
        obj.run();
    }
    
}