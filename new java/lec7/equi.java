import java.util.Scanner;

public class equi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            int m1 = sc.nextInt();
            int c1 = sc.nextInt();
            int m2 = sc.nextInt();
            int c2 = sc.nextInt();

            double equilibriumPrice = (double) (c2 - c1) / (m1 - m2);
            equilibriumPrice=floor(equilibriumPrice+0.5);

            if (m1 == m2 || equilibriumPrice <= 0) {
                System.out.println(-1);
            } else {
                System.out.println(equilibriumPrice*m1+c1); 
            }
            T--;
        }
    }
}
