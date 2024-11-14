import java.util.*;
public class main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row = 1;
        int star = 1;
        int space1 = n - 1;
        int space2 = -1;
        int m=0;
        while (row <= n) 
        {
            if(row<=n/2+1)
            {
                m=row;
            }
            else
            {
                m=n-row+1;;
            }
            
            int i = 1;
            while (i <= space1) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while (j <= star) 
            {
                System.out.print(m+" ");
                m--;
                j++;
            }
            int k = 1;
            while (k <= space2) {
                System.out.print(" ");
                k++;
            }
            int l = 1;
            m = 1;
            while (l <= star && row != 1 && row != n) {
                System.out.print(m+" ");
                m++;
                l++;
            }

            if (row <= n / 2) 
            {
                space1 -= 2;
                space2 += 2;
                star += 1;
            } 
            else 
            {
                space1 += 2;
                space2 -= 2;
                star -= 1;
            }

            row++;
            System.out.println();
        }

    }
}
