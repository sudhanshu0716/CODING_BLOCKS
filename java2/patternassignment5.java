import java.util.Scanner;

public class patternassignment5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        int row=1;
        int space2=n-2;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            if(row==1 || row==n){
                int j=1;
                while(j<=n){
                    System.out.print("*");
                    j++;
                }

            }
            else{
                System.out.print("*");
            }
            int k=1;
            while(k<=space2){
                System.out.print(" ");
                k++;
            }
            if(row!=1 && row!=n){
                System.out.print("*");
            }
            space--;
            row++;
            System.out.println();


        }
    }

    
}
