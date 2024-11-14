import java.util.Scanner;

public class loop1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i){
                count++;
            }

        }
        if(count==1){
            System.out.println("prime");
            
        }
    }
}
