package lec13;

public class string_palindrome {
    public static void main(String[] args) {
        String s1="pop";
        palin(s1);
        
    }
    public static void palin(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                System.out.println("not a palindrome");
                break;
            }
            else{
                count++;
            }
        }
        if(count==s.length()){
            System.out.println("palindrome");
        }
    }
    
}
