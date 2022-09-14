import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] arg){
      Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int fre=1;
        for(int i=0;i<str.length();i++){
            if( i==0 || str.charAt(i-1) !=str.charAt(i) ){
                 if(fre>1){
                   System.out.print(fre);
                   fre=1;}
                System.out.print(str.charAt(i));
              
               
            }else{
                fre++;
            }
            if(i==str.length() -1 && fre >1){
                System.out.print(fre);
            }
        }
        


}
}