import java.io.*;
import java.util.*;

public class Solution {
    public static int second(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }else if(arr[i] >secondlargest && arr[i]<largest ){
                secondlargest = arr[i];
            }
        }
        return (secondlargest);
        
        
         
        }

    public static void main(String[] args) {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int arr1 [] = new int[num];
        for(int i=0 ; i<num ;i++){
            arr1[i] = scn.nextInt();
        }
        System.out.println(second(arr1));
        
    }
}