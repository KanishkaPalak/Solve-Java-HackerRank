import java.util.*;
import java.io.*;
import java.lang.Math.*;
class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int i,j;
        for(i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        
        int sum=a;
        for(j=0;j<n;j++)
        {
            sum+= b*(Math.pow(2,j)); 
            System.out.print(sum + " ");
        }
            System.out.print("\n");
        }
        in.close();
    }
}
