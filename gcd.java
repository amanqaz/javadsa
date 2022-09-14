import java.io.*;
import java.util.*;

public class Solution {
    public static int gcd(int a,int b){
      
        while(a % b!=0){
            int remender = a % b;
            a=b;
            b= remender;
        }
        return(b);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        System.out.print(gcd(a,b));
    }
}