import java.util.Scanner;

public class reverse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int remain=0;
        int rev=0;
        while(a>0){
            remain=a%10;
            rev=rev*10+remain;
            a=a/10;
        }
        System.out.println(rev);
        }



    }
    

