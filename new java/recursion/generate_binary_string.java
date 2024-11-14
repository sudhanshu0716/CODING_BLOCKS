package recursion;
import java.util.*;
public class generate_binary_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        binaryfiller(s, "", 0);
    }
    public static void binaryfiller(String s,String ans,int cur){
        if(ans.length()==s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(cur)=='?'){
            binaryfiller(s,ans+"0", cur+1);
            binaryfiller(s,ans+"1", cur+1);
        } 
        else {
            binaryfiller(s,ans+s.charAt(cur), cur+1);
        }
    }
}
