package string_assignment;

import java.util.Scanner;


public class good_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String a=sc.nextLine();
        int count=0;
        int maxcount=0;
        for(int i=0;i<a.length();i++){
            char x=a.charAt(i);
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                count++;
                if(count>maxcount){
                    maxcount=count;
                }

            }
            else{
                count=0;
            }
        }
        System.out.print(maxcount);
    }
    
}
