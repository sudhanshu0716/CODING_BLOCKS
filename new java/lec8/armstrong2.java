package lec8;

import java.util.Scanner;

public class armstrong2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=arm(n,count(n));
        if(a==n){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
    public static int count(int a){
        int count =0;
        while(a>0){
            a=a/10;
            count++;
        }
        return count;
    }
    public static int arm(int a,int b){
        int sum=0;
        int rem=0;
        while(a>0){
            rem=a%10;
            sum=(int) (sum+Math.pow(rem, b));
            a=a/10;
        }
        return sum;
    }
    
}
