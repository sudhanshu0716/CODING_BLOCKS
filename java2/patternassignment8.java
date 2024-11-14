import java.util.Scanner;

public class patternassignment8{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        int space2=-1;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            int j=1;
            int digit=row;
            while(digit<=row && digit!=0){
                System.out.print(digit);
                digit--;
            }
            int p=1;
            while(p<=space2){
                System.out.print(" ");
                p++;
            }
            int k=1;
            while(k<=row){
                System.out.print(k);
                k++;
            }
            if(row<=n/2){
                space--;
                space2+=2;

            }
            else{
                space++;
                space2-=2;
            }
            row++;
             System.out.println();

            

            
            

        }

    }
}

