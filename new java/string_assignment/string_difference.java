package string_assignment;

import java.util.Scanner;

public class string_difference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0; i<a.length();i++){
            System.out.print(a.charAt(i));
            if(i+1<a.length()){
                int x=(int)a.charAt(i+1);
                System.out.print(x-(int)a.charAt(i));
            }
        }
    }
    
}
