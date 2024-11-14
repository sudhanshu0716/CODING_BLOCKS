import java.util.*;
public class cookies_piles {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i=0;i<testcase;i++){
            int timer=sc.nextInt();
            int top=sc.nextInt();
            int diff=sc.nextInt();
            System.out.println(piles(timer,top,diff));
        }
    }
    public static int piles(int timer,int top,int diff){
        int sum=top;
        int sum2=0;
        if(timer==1){
            return top;
        }
        else{
            for(int i=1;i<timer;i++){
                sum=sum+diff;
                sum2=sum2+sum;
            }
            return sum2+top;
        }
        

    }
}