package lec8;
import java.util.*;

public class tilecost {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        int n=ab.nextInt();
        int total=0;
        while(n>0){
            int a=ab.nextInt();
            int b=ab.nextInt();
            int c=ab.nextInt();
            int l=ab.nextInt();
            int r=ab.nextInt();
            while(l<=r){
                int tile=l*l*a+b*l+c+tile;
                total=total+tile;
                l++;
            }
            n--;
            
        }
        System.out.println(total);
    }
    
}

