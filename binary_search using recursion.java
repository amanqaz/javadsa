import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] arg){
      Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num = scn.nextInt();
        int arr[]= new int[num];
        for(int i=0;i<num;i++){
            arr[i]=scn.nextInt();
            
        }
        System.out.println("Please enter the elemnent search in the array");
        int search = scn.nextInt();
        int index1= binary_search(arr, search,num);

}
}


        // i am writing code for binary search
        public static int binary_search(int arr[] , int target ,int num){
            if(num==1){
                if(arr[0]==target){
                    return (0);
                }else{
                    return (-1);
                }
            }
            else{
            int start = 0;
            int end = num;
            int mid =(start + end)/2+1;
            while(mid>0){
            if(arr[mid]<=target){
                if(arr[mid]== target){
                    return mid;
                    mid=0;
                }else{
                    end=mid;
                    mid=(start + end)/2 +1;
                }
            }
            
        }
        }
        }
                
            
        
            
            
            
            
//         }
        
        
        
        // int index1=binary_search(arr search);
        
        
        
        
    
