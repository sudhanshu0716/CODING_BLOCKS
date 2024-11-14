package string_assignment;
import java.util.*;

public class can_you_read_this {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            System.out.print(a.charAt(i));
            if(i+1<a.length() && (int)a.charAt(i+1)<91 ){
                System.out.println();
            }
        }
    }
    
}
