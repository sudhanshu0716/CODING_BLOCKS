import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i>=0;i--){
            if(n%i==0 && m%i==0){
                System.out.println(i);
                break;
            }
        
        }
    }
}
