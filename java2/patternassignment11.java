import java.util.Scanner;

public class patternassignment11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=0;
        int digit=n;
        while(row<=2*n+1){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            int value=digit;
            while(j<=digit){
                System.out.print(value+" ");
                j++;
                value--;
            
            }
            System.out.print("0 ");
            int k=1;
            while(k<=digit){
                System.out.print(k+" ");
                k++;
            }
            row++;
            if (row<=n+1){digit--;
            space++;}
            else{
                space--;
                digit++;
            }
            System.out.println();
            
            
        }

    }
    
}
