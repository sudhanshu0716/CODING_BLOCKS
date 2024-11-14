import java.util.Scanner;

public class replace5from0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int rem=0;
        int sum=0;
        int rem2=0;
        int sum2=0;
        while(n>0){
            rem=n%10;
            if(rem==0){
                sum=sum*10+5;
            }
            else{
                sum=sum*10+rem;
            }
            n=n/10;

            

        }
        while(sum>0){
            rem2=sum%10;
            sum2=sum2*10+rem2;
            sum=sum/10;
        }
        System.out.println(sum2);
     }

    
}
