import java.util.*;
public class CalenderDemo {
    public static void main(String[] args) {
        Calendar e = Calendar.getInstance();
        System.out.println(" "+e.getTime());
        System.out.println(" "+e.getTimeZone());
        System.out.println(" "+e.getCalendarType());
        System.out.println(" "+e.getFirstDayOfWeek());
    }
}
