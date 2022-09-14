import java.io.*;
import java.util.*;

public class Solution {
    public static ArrayList<String> subset(String st , int idx){
        if(idx == st.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> res = subset(st , idx+1);
        
     ArrayList<String> ans = new ArrayList<>();
        for(String res1:res){
            ans.add(res1);
        }  
       
            for(String res1:res){
            ans.add(st.charAt(idx) + res1);
        }
    
        return ans;
        
        
    }
    public static void main(String[] arg){
      Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
        
        ArrayList<String> result = subset(st , 0);
        
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
        

      

}
}

