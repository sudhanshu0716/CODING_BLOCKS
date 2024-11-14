package recursion;

import java.util.*;

public class generate_parantheses {
    public static void main(String[] args) {
        int n=2;
        List<String> ll=new ArrayList<>();
        Parantheses(n, 0, 0, "",ll);
        System.out.println(ll);
        
    }
    public static void Parantheses(int n,int open ,int close,String ans,List<String>ll){
        if(open==n && close==n){
            ll.add(ans);
            return ;
        }
        if(open>n || close>open){
            return;
        }
        Parantheses(n, open+1, close, ans+"(",ll);
        Parantheses(n, open, close+1, ans+")",ll);

    }
    
}
