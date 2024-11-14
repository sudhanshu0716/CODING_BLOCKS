import java.util.Stack;
public class one {
    public Node expTree{
        
        
    }
    public String getpostfix(String s){
        StringBuilder sb=new StringBuilder();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sb.append(ch);
            } 
            else if (ch == '(') {
                st.push(ch);
            } 
            else if (ch == ')') {
                while (st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.pop();
            } 
            else {
                while (!st.isEmpty() && getValue(st.peek()) >= getValue(ch)) {
                    sb.append(st.pop());
                }
                st.push(ch);
            }

        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
        }
    public int getValue(char c){
        if(c=='*' || c=='/'){
            return 2;
        }
        else if(c=='+' || c=='-'){
            return 1;
        }
        return -1;
    }
    
}
