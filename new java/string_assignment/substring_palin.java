package string_assignment;
import java.util.*;
public class substring_palin {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    String a=sc.nextLine();
    int count=0;
    for(int i=0;i<a.length();i++){
        for(int j=i+1;j<=a.length();j++){
            if(palindrome((a.substring(i,j)))){
                count++;
            }
        }

    
    }
    System.out.println(count);
    }
    public static boolean palindrome(String a){
        for(int i = 0; i < a.length() / 2; i++){
            if(a.charAt(i) != a.charAt(a.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    }
    


                                                     

