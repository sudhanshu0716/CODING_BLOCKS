package recursion;
import java.util.*;

public class partitioning {
    public static void main(String[] args) {
        String ques="nitin";
        partitioning( ques,"");
        List<List<String>> ll=new ArrayList<>()
    }
    public static void partitioning(String ques ,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0, i);
            if(palin(s)){
                partitioning(ques.substring(i), ans+s+"|");
            }
        }
    }
    public static boolean palin(String ans){
        int i=0;
        int j=ans.length()-1;
        while(i<=j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
    
}
