import java.util.Scanner;

public class list_of_arm {
    public static int noofdigit(int a){
        int count=0;
        while(a>0){
            a=a/10;
            count++;
        }
        return count;
    }
    public static int sumofpow( int a,int b){
        int sum=0;
        int rem=0;
        while(a>0){
            rem=a%10;
            sum+=Math.pow(rem,b);
            a=a/10;

        }
        return sum;



    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int d=noofdigit(i);
            int e=sumofpow(i,d);
            if(i==e){
                System.out.println(i);
            }




        }
    }
    
}
