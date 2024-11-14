import java.util.*;
public class n2frequency {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int n=sc.nextInt();
        int b=1;
        while(count>=0){
            if((3*b+2)%n!=0){
                System.out.println(3*b+2);

            }
            b++;
            count--;

        }

    }
}