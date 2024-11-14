import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        int a=0;
        while(n>0){
            a=n%10;
            if(a==m){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
    
}
