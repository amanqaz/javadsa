import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        // print the substring
        int num= scn.nextInt();
        
        int arr[]=new int [num];
        // user input array;
        for(int i=0;i<num;i++){
            arr[i]=scn.nextInt();
        }
        for(int start =0;start<num;start++){
            for(int end=start;end<num;end++){
                for(int j=start;j<=end;j++){
                    System.out.print(arr[j] +" ");
                }System.out.println("");
            }
        }

    
  }
    
     
}






