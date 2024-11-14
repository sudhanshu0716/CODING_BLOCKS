import java.util.Scanner;

public class comulativesum {
    public static void main(String[] args) {
        int sum=0;
        while(sum>=0){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sum=sum+n;
            if(sum>0){
                System.out.println(n);
            }
            else{
                break;
            }

        }
    }
    
}
