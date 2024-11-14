import java.util.Scanner;

public class patternassignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            int j=1;
            int k=row;
            while(j<=star){
                System.out.print(k);
                if(row>j){
                    k++;
                }
                if(row<j+1){
                    k--;
                }
                j++;
            }
            star+=2;
            space--;
            row++;
            System.out.println();
        }
    }
    
}
