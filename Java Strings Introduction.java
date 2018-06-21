import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        int al=A.length();
        int bl=B.length();
        char a[]=A.toCharArray();
        char b[]=B.toCharArray();
        String YesNo="";
        int av=a[0];
        int av1=a[1];
        int bv=b[0];
        int bv1=b[1];
        if(bv<av){YesNo="Yes";}
        else if(bv>av){YesNo="No";}
        else if(av==bv){if(bv1<av1){YesNo="Yes";}
                       else {YesNo="No";}}
        System.out.println(YesNo);
        
        a[0]=Character.toUpperCase(a[0]);
        String newA=new String(a);
        b[0]=Character.toUpperCase(b[0]);
        String newB=new String(b);
        
        System.out.println(newA+" "+newB);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
