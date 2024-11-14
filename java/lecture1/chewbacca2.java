import java.util.*;

public class chewbacca2{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int c = 1;
            int c1 = 2;

            // Calculate the number of smartphones purchased by Aayush and Harshit
            while (true) {
                n -= c;
                if (n < 0) {
                    System.out.println("Harshit");
                    break;
                }
                m -= c1;
                if (m < 0) {
                    System.out.println("Aayush");
                    break;
                }
                c += 2;
                c1 += 2;
            }
        }
    }
}