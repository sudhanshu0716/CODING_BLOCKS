import java.util.Scanner;

public class kthroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int x;
        while(n>0){

            long a=sc.nextLong();
            long b=sc.nextLong();
            double c= (double)1/b;
            x=(int)Math.pow(a,c);
            System.out.println(x);
            n--;
        }
    }
}
