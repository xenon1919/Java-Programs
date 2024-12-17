import java.util.*;
public class DateDemo2 {
    public static void main(String[] args) {
        
        Date d0 = new Date(122,10,23);
        System.out.println("Entered Date 1 is "+d0);
        Date d1 = new Date(122,10,15,21,25,45);
        System.out.println("Entered Date 2 is "+d1);
        Date d2 = new Date(122,11,22,16,26);
        System.out.println("Entered Date 3 is "+d2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Year: ");
        int year = sc.nextInt();
        System.out.println("Month: ");
        int month = sc.nextInt();
        System.out.println("Date: ");
        int date = sc.nextInt();
        year -= 1900;
        Date d3 = new Date(year,month,date);
        System.out.println("Entered Date 3 is "+d3);
        Date d4 = new Date();
        System.out.println("Today's Date is "+d4);
    }
}