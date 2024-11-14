package recursion;
import java.util.*;

public class key_pad {
    static String[]map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String ques="12";
        List<String> ll=new ArrayList<>();
        Keypad(ques, "");
        System.out.println(ll);
        
    }
    public static void Keypad(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        String press=map[ch-'0'];
        for(int i=0;i<press.length();i++){
            Keypad(ques.substring(1), ans+press.charAt(i));
        }

    }
}
