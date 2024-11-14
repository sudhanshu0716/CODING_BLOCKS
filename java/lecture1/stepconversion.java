import java.util.Scanner;

public class stepconversion {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int f2=sc.nextInt();
        int s=sc.nextInt();
        int c=0;
        while(f<=f2){
            c=((5)*(f-32))/9;
            System.out.println(f+" "+c);
            f=f+s;
        }


    }
    
}
