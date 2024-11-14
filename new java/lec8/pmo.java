import java.util.Scanner;

public class pmo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(prime(a,b));
        }
        
    }
    public static int prime(int a,int b){
        int fina=0;
        for(int i=a;i<=b;i++){
            int count=0;
            int total=0;
            for(int j=i-1;j>1;j--){
                if(i%j==0){
                    count++;
                }

            }
            if(count==0){
                total++;
            }
            fina=fina+total;
        }
        
        return fina;
    }
    
}
