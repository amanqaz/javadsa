import java.util.*;

public class Main{
    public static ArrayList<String> getmazejump(int sr , int sc , int dr , int dc){
         if(sr==dr && sc == dc){
             ArrayList<String> base = new ArrayList<>();
             base.add("");
             return  base;
         }
        
        ArrayList<String> ans = new ArrayList<>();
        
        int jump =1;
        while(sr + jump <=dr){
            ArrayList<String> vert = getmazejump(sr+jump,sc,dr,dc);
            
            for(String s : vert){
                ans.add("v"+jump +s);
            }
            jump++;
        }
         jump =1;
        while(sc + jump <=dc){
            ArrayList<String> hori = getmazejump(sr,sc+jump,dr,dc);
            
            for(String s : hori){
                ans.add("h"+jump +s);
            }
            jump++;
        }
               jump =1;
        while(sr + jump <=dr && sc + jump <=dc){
            ArrayList<String> dia = getmazejump(sr+jump,sc+jump,dr,dc);
            
            for(String s : dia){
                ans.add("d"+jump+s);
            }
            jump++;
        }
        return ans;
        
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col  = scn.nextInt();
        ArrayList<String> result = getmazejump(0,0,row-1,col-1);
        System.out.print(result);
    }
}