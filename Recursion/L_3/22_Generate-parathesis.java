
import java.util.*;

class generate_Parenthesis{
    public static void main(String[] args){
        int n = 3;
        List<String> ll = new ArrayList<>();//new
        Parenthesis(n,"",0,0,ll);
        System.out.println(ll);
    }
    public static void Parenthesis(int n, String ans,int open,int closed,List<String> ll){
        if(open == n && closed == n){
           // System.out.println(ans);
            ll.add(ans);//new
            return;
        }
        if(open > n || closed > open){
            return;
        }   
        Parenthesis(n,ans+"(", open+1,closed,ll);//left recursion call
        Parenthesis(n, ans+")", open, closed+1,ll);//right recursion call
    }
}