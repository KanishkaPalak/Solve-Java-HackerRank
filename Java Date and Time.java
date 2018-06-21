import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        int nmonth=Integer.parseInt(month);
        int nday=Integer.parseInt(day);
        int nyear=Integer.parseInt(year);
        
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR,nyear);
        cal.set(Calendar.MONTH,nmonth-1);
        cal.set(Calendar.DAY_OF_MONTH,nday);
        int weekDay=cal.get(Calendar.DAY_OF_WEEK);
        switch(weekDay){
            case 1 : System.out.println("SUNDAY");
                     break;
            case 2 : System.out.println("MONDAY");
                     break;
            case 3 : System.out.println("TUESDAY");
                     break;
            case 4 : System.out.println("WEDNESDAY");
                     break;
            case 5 : System.out.println("THURSDAY");
                     break;
            case 6 : System.out.println("FRIDAY");
                     break;
            case 7 : System.out.println("SATURDAY");
                     break;
        }
    }
}
