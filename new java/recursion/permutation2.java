package recursion;

public class permutation2 {
    public static void main(String[] args) {
        String ques="ACA";
        Print(ques,"");


    }
    public static void Print(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            boolean val=false;
            for(int j=i+1;j<ques.length();j++){
                if(ques.charAt(j)==ch){
                    val=true;
                    break;
                }
            }
            if(val==false){
                String s1=ques.substring(0, i);
                String s2=ques.substring(i+1);
                Print(s1+s2, ans+ch);
            }

        }
    }
    
}
