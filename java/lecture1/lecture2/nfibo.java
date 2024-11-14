package lecture2;

import java.util.Scanner;

public class nfibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        while(n>=2){
            sum=a+b;
            a=b;
            b=sum;
            n--;

        }
        System.out.println(b);



    }
    
}
