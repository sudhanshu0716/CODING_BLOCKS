import java.util.*;
public class delhi_even {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int nofcar=sc.nextInt();
        while(nofcar>0){
            Scanner un=new Scanner(System.in);
            int a=un.nextInt();
            int sumeven=0;
            int sumodd=0;
            int remainder=0;
            while(a>0){
                remainder=a%10;
                if(remainder%2==0){
                    sumeven+=remainder;
                }
                else{
                    sumodd+=remainder;
                }
                a=a/10;

                
            }
            if(sumeven%4==0 || sumodd%3==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }


        }


    }
}