import java.util.*;

public class Main{
    public static void printsub(int idx, String input , String output){
        if(idx == input.length()){
            System.out.println(output);
            return ;
        }
        
        char ch = input.charAt(idx);
        
        // yes 
        printsub(idx+1 , input , output+ch);
        
        // no 
        printsub(idx+1,input,output);
        
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        printsub( 0 , str ,"");
      
    }
}