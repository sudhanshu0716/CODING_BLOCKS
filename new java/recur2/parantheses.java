package recur2;

public class parantheses {
    public static void main(String[] args) {
        int n=3;
        parantheses(3, 0,0,"");

    }
    public static void parantheses(int n, int open,int close,String ans){
        if(open==n && close==n){
            System.out.println(ans);
            return;
        }
        if(open>n || close>open){
            return;
        }
        parantheses(n, open+1, close, ans+"(");
        parantheses(n, open, close+1, ans+")");
    }
    
}
