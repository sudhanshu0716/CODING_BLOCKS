import java.util.Scanner;

public class armstrong {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        int b=a;
        int c=a;
        int sum=0;
        while(a>0){
            a=a/10;
            count++;
        }
        while(b>0){
            int remain=b%10;
            int pow=count;
            int e=1;
            while(pow>0){
                e=e*remain;
                pow--;}
                sum=sum+e;
            b=b/10;
        }
        if (c==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }



    }
    
}
