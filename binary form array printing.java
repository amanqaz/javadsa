import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static int decimal(int n){
        int res = 0;
        int multipler = 1;
        while(n>0){
            int divisor=n/2;
            int remainder=n%2;
            n =divisor;
            res = res+remainder*multipler;
            multipler *=10;
        }
        return res;
        
    }
    
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        // print the substring
        int num= scn.nextInt();
        
        int arr[]=new int [num];
        // user input array;
        for(int i=0;i<num;i++){
            arr[i]=scn.nextInt();
        }
        int power=(int)Math.pow(2,num);
        for(int dec=0;dec<power;dec++){
            int todec = decimal(dec);
            for(int u=1;u<=num;u++){
               int div=(int)Math.pow(10,(num-u));
                int bit =(todec/div)%10;
                if(bit==1){
                    System.out.print(arr[u-1]+" ");
                }else{
                    System.out.print(" ");
                }
              
            }System.out.println("");
        }
            
        }

    
  }