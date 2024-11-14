import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=0;
        for(int i=n;i>=0;i--){
            if(n%i==0 && m%i==0){
                a=i;
                break;
            }
        
        }
        System.out.println((m*n)/a);
    }
}
