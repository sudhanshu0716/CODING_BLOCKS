package recursion;

public class permutation {
    public static void main(String[] args) {
        String ques="ABC";
        Print(ques,"");


    }
    public static void Print(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            String s1=ques.substring(0, i);
            String s2=ques.substring(i+1);
            Print(s1+s2, ans+ques.charAt(i));
        }
    }
    
}