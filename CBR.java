public class CBR {
   public static void main(String[] args) {
      Cbr p = new Cbr(30);
      Cbr q = new Cbr(45);
      System.out.println("Before swap a = " + p.a + " and b = " +q.a);
      swapFunction(p, q);
      System.out.println("Before,After swap values:");
      System.out.println("After swap, a = " + p.a + " b = " + q.a);
   }
   public static void swapFunction(Cbr p, Cbr q) {
      System.out.println("Before swap, a = " + p.a + " b = " + q.a);
      // Swap n1 with n2
      Cbr c = new Cbr(q.a);
      p.a = q.a;
      q.a = c.a;
      System.out.println("After swapping(Inside), a = " + p.a + " b = " + q.a);
   }
}
class Cbr {
   public int a;
   public Cbr(int a){ this.a = a;}
}