import java.util.Scanner;

public class boston {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int remain=0;
        int sum=0;
        while(n>0){
            remain=n%10;
            sum=sum+remain;
            n=n/10;
        }
        System.out.println(sum);
        
        
    }
    
}
