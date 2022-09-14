import java.util.*;

public class Main{
    public static ArrayList <String> climbStair(int n){
        if(n==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }else if(n<0){
            ArrayList<String> base = new ArrayList<>();
            return base;
        } 
        
        ArrayList<String> smallans1 = climbStair(n-1);
        ArrayList<String> smallans2 = climbStair(n-2);
        ArrayList<String> smallans3  = climbStair(n-3);
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(String str:smallans1){
            ans.add(1+str);
        }
        for(String str :smallans2){
            ans.add(2+str);
            
        }
        for(String str:smallans3){
            ans.add(3+str);
        }
        return ans;
         
    }
    
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
        ArrayList<String> res = climbStair(n);
        for(int i = 0;i< res.size();i++){
            System.out.println(res.get(i));
        }
        
    }
}