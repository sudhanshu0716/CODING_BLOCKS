package string_assignment;

import java.util.Scanner;

public class odd_even_char {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            if(i%2==0){
                System.out.print(asciinext(a.charAt(i)));
            }
            else{
                System.out.print(asciiprev(a.charAt(i)));
            }
        }
    }
    public static char asciinext(char a){
        int x=(int)a;
        int temp=x+1;
        return (char)temp;
    }
    public static char asciiprev(char a){
        int x=(int)a;
        int temp=x-1;
        return (char)temp;
    }
    
}
