// import java.io.*;
// import java.util.*;

// public class Solution {
//     public static void main(String[] arg){
//       Scanner scn = new Scanner(System.in);
//         String str = scn.nextLine();
//         char  arr[]= new char[str.length()];
//         for(int i=0;i<str.length();i++){
//             arr[i]=str.charAt(i);
//         }
//         for(int i=0;i<str.length();i++){
//             if( i==0 || arr[i-1] !=arr[i] ){
//                 System.out.print(arr[i]);
//             }
//         }
        


// }
// }

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] arg){
      Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        for(int i=0;i<str.length();i++){
            if( i==0 || str.charAt(i-1) !=str.charAt(i) ){
                System.out.print(str.charAt(i));
            }
        }
        


}
}