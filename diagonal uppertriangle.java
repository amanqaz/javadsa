import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        // print the substring
        int num= scn.nextInt();
        
        int arr[][]=new int [num][num];
        // user input array;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
            arr[i][j]=scn.nextInt();
        }
        }
      for(int gap=0;gap<num;gap++){
          for(int j=0,k=gap;k<num;j++,k++){
              System.out.println(arr[j][k]);
          }
      }

            
        }

    
  }
    
     