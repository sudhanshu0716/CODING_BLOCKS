import java.util.Scanner;

public class patternassignment10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n*2-3;
        while(row<=n){
            int digit=1;
            int backdigit=row;
            int i=1;
            while(i<=star){
                System.out.print(digit);
                digit++;
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int k;
            if(row==n){
                k=2;
                backdigit=row-1;
            }
            else{
                k=1;
            }
            while(k<=star){
                System.out.print(backdigit);
                backdigit--;
                k++;
            }
            star++;
            space-=2;
            row++;
            System.out.println();




        }
    }
    
}
