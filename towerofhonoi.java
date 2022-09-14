import java.io.*;
import java.util.*;

public class Solution {
    public static void toh(int disk ,int A , int B , int C ){
        if(disk ==0) return;
        toh(disk-1 , A , C, B);
        System.out.println("tower move "+ A + "->" + B );
        
        toh(disk-1 , C ,B,A);
      
    }
    public static void main(String[] arg){
      Scanner scn = new Scanner(System.in);
        int disk = scn.nextInt();
        int src = scn.nextInt();
        int des = scn.nextInt();
        int aux = scn.nextInt();
        
        toh(disk,src,des,aux);

      

}
}