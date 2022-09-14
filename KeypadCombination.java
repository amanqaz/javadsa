import java.util.*;

public class Main{
    static String[] dtoc = {".;" , "abc", "def", "ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList <String> getKPC(String st  , int idx){
        if(idx==st.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> smallans = getKPC(st , idx+1);
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(Character letter : dtoc[st.charAt(idx) - '0'].toCharArray()){
            for(String smallstr:smallans){
                ans.add(letter + smallstr);
            }
        }
        return ans;
        
    }
    
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
        String str= scn.next();
        ArrayList<String> res = getKPC(str , 0);
        for(int i = 0;i< res.size();i++){
            System.out.println(res.get(i));
        }
        
    }
}