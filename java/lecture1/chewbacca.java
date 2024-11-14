import java.util.Scanner;

public class chewbacca {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long i=sc.nextLong();
        int rem=0;
        int mul=1;
        int sum=0;
        int count=0;
        while(i>9){
            rem=(int) (i%10);
            if(rem>=5){
                sum+=(9-rem)*mul;
                mul*=10;
                count++;
                i=i/10;
            }
            else{
                sum+=rem*mul;
                mul*=10;
                count++;
                i=i/10;
            }
        }
        if(i>=5 && i!=9){
            sum+=(9-i)*Math.pow(10,count);
        }
        else {
            sum+=i*Math.pow(10,count);
        }
        System.out.println(sum);
    }
    
}
