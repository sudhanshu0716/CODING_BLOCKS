import java.util.*;
public class simpleinput {
    
    public static void main(String args[]) {
        int sum=0;
        int count=0;
        for(int i=0;i>=count;i++){
            Scanner sc=new Scanner(System.in);
            count++;
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