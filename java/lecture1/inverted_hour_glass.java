import java.util.*;
public class inverted_hour_glass {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row = 1;
        int star = 1;
        int space = 2*n-1;
        while (row <=2*n+1) 
        {
            int x=n;
            int i = 1;
            while (i <= star) 
            {
                System.out.print(x+" ");
                i++;
                x--;
            }
            int j = 1;
            while (j <=space) 
            {
                System.out.print(" "+" ");
                j++;
                
            }
            int k = 1;
            if (row == n+1) 
            {
                x+=1;
                k = 2;
            }
            while (k <= star) 
            {
                x++;
                System.out.print(x+" ");
                k++;
            }
            if (row <= n) 
            {
                star++;
                space -= 2;
            } 
            else 
            {
                star--;
                space += 2;
            }

            row++;
            System.out.println();
        }

    }
}