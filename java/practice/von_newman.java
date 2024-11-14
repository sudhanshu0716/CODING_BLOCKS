import java.util.Scanner;

public class von_newman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            System.out.println(binary(a));
        }
        
    }
    public static int binary(int n){
        int bin=0;
        int mul=1;
        while(n>0){
            int a=n%10;
            bin=bin+a*mul;
            mul*=2;
        }
        return bin;
    }
}
