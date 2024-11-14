package lec-14;

public class palinllet {
    class Solution {
        public String longestPalindrome(String s) {
            int max=0;
            String x="";
            String a="";
            if(s.length()<=2){
                if(s.length()==1){
                    return s;
                }
                else if (s.charAt(0)==s.charAt(1)){
                    return s;
                }
                else{
                    x=""+s.charAt(0);
                    return x;
                }
        
            }
            else{
                for(int i=0;i<s.length();i++){
                    int count =0;
                    for(int j=i+1;j<s.length();j++){
                        a=s.substring(i,j);
                        if(palin(a)){
                            count=j-i;
                            if(count>max){
                                max=count;
                                x=a;
                            }
                        }
                    }
                }
    
            return x;
            }
            
        }
        public static boolean palin(String s){
            int count=0;
            if (s.length()<=1){
                return true;
            }
            else{
                for(int i=0;i<s.length()/2;i++){
                    if(s.charAt(i)==s.charAt(s.length()-i-1)){
                        count++;
                    }
                }
                if(count ==s.length()/2){
                    return true;
                }
                else{
                    return false;
            }
    
            }
    
    
    
        }
    
    }
    
}
