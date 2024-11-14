package jan_assignment;

import java.util.Scanner;

public class lockdown_mirzapur {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int  testcase=sc.nextInt();
        for(int i=0; i<testcase;i++){
            int n=sc.nextInt();
            int r=sc.nextInt();
            int ans=fact(n)/(fact(r)*fact(n-r));
            System.out.println(ans);
        }
        

    }
    public static int fact(int n){
        int facto=1;
        for(int i=2;i<=n;i++){
            facto=facto*i;
        }
        return facto;
    }
}
