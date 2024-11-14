package string_assignment;

import java.util.*;
public class string_max {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        String a=sc.nextLine();
        int counter=0;
        char temp=0;
        for(int i=0;i<a.length();i++){
            int value=frequency(a.charAt(i),a);
            if(value>counter){
                counter =value;
                temp=a.charAt(i);
            }

        }
        System.out.println(temp);
        
    }
    public static int frequency(char a,String b){
        int count =0;
        for(int i=0;i<b.length();i++){
            if(a==b.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
