import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rem=0;
        int pow=1;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum=sum+rem*pow;
            pow=pow*2;
        }
        System.out.print(sum);

    }
    
}
