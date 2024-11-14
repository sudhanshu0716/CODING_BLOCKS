import java.util.Scanner;

public class converter {
    public static int deciconverter(int a,int b){
        int sum=0;
        int mul=0;
        int rem=0;
        while(a>0){
            rem=a%10;
            sum+=rem*Math.pow(b,mul);
            mul++;
            a=a/10;
        }
        return sum;

    }
    public static int anyconverter(int a,int b){
        int sum=0;
        int rem=0;
        int mul=0;
        while(a>0){
            rem=a%b;
            sum+=rem*Math.pow(10,mul);
            mul++;
            a=a/b;

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=deciconverter(c, a);
        int e=anyconverter(d, b);
        System.out.println(e);

    }
}