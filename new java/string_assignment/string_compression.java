package string_assignment;

import java.util.Scanner;

public class string_compression {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner (System.in);
    String a=sc.nextLine();
    int x=0;
    int y=0;
    
    for(int i=0;i<a.length();i++){
        y=i;
        int j=i+1;
        int count=0;
        System.out.print(a.charAt(i));
        if(j<a.length() && a.charAt(i)==a.charAt(j) ){
            while(j<a.length() && a.charAt(i)==a.charAt(j)){
                j++;
                count++;
            }
            System.out.print(count+1);
            i+=count;
        }
        else{
            System.out.print("1");
        }
    }

   
    }

}

