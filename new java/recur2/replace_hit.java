package recur2;

import java.util.*;
public class replace_hit {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        System.out.println(NoOfHi(s, 0));
        System.out.println(removeHi(s, 0, ""));
        System.out.println(addbye(s, 0, ""));
        
    }
    public static int  NoOfHi(String s,int idx){
        if(idx==s.length()){
            return 0;
        }
        if(idx+1<s.length() && s.charAt(idx)=='h' && s.charAt(idx+1)=='i'){
            if(idx+2<s.length()&& s.charAt(idx+2)=='t'){
                return NoOfHi(s,idx+1);
            }
            else{
                return 1+NoOfHi(s,idx+2);
            }
        }
        return NoOfHi(s,idx+1);
    }
    public static String  removeHi(String s,int idx,String ans){
        if(idx==s.length()){
            return ans;
        }
        if(idx+1<s.length() && s.charAt(idx)=='h' && s.charAt(idx+1)=='i'){
            if(idx+2<s.length()&& s.charAt(idx+2)=='t'){
                return removeHi(s,idx+1,ans+s.charAt(idx));
            }
            else{
                return removeHi(s,idx+2,ans+"");
            }

        }
        return removeHi(s,idx+1,ans+s.charAt(idx));
    }
    public static String  addbye(String s,int idx,String ans){
        if(idx==s.length()){
            return ans;
        }
        if(idx+1<s.length() && s.charAt(idx)=='h' && s.charAt(idx+1)=='i'){
            if(idx+2<s.length()&& s.charAt(idx+2)=='t'){
                return addbye(s,idx+1,ans+s.charAt(idx));
            }
            else{
                return addbye(s,idx+2,ans+"bye");
            }
        }
        return addbye(s,idx+1,ans+s.charAt(idx));
    }
}
