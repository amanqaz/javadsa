import java.io.*;
import java.util.*;

public class Solution {
    public static int power(int x,int n){
        if(n==0) return 1;
        int pow_n_by_2= power(x,n/2) ;
        if(n%2==1){
            return x*(pow_n_by_2 * pow_n_by_2);
        }
        return (pow_n_by_2 * pow_n_by_2);
    }
    public static void main(String[] arg){
      Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int times=scn.nextInt();
        System.out.print(power(num,times));

      

}
}
