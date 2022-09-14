import java.util.*;
//getmazepair ; 
public class Main{
    public static ArrayList<String> getmazepair(int sr, int sc , int dr ,int dc){
          if(sr >dr || sc >dc){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        if(sr == dr && sc==dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
      
         ArrayList<String>  hori =getmazepair(sr,sc+1,dr,dc);
         ArrayList<String> vert = getmazepair(sr+1 , sc , dr , dc);
        
        ArrayList<String> ans = new ArrayList<>();
       
        
        for(String s : hori){
            ans.add('h' + s);
        }
      
        for(String s : vert){
            ans.add('v' + s);
        }
        
        return ans;
        
        
    
        
    }
    
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        ArrayList<String> result = getmazepair(0 , 0 , row-1,col-1);
        System.out.print(result);
        
        
        
        
    }
}