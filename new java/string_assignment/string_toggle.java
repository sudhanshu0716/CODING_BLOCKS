package string_assignment;
import java.util.*;

public class string_toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            int x=a.charAt(i);
            if((int)x>95){
                System.out.print((char)(x-32));
            }
            else{
                System.out.print((char)(x+32));
            }
        }
    }

    
}
