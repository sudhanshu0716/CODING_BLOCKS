import java.util.*;
public class patternassignment6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n - 1;
        int currentValue = 1;

        while (row <= (2 * n) - 1) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            int m = currentValue;

            while (j <= star) {
                System.out.print(m+" ");
                if (j <= star / 2) {
                    m++;
                } else {
                    m--;
                }
                j++;
            }

            if (row < n) {
                star += 2;
                space--;
                currentValue++;
            } else {
                star -= 2;
                space++;
                currentValue--;
            }

            row++;
            System.out.println();
        }
    }
}