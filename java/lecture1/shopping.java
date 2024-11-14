import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        for (int i = 0; i < s; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = 1;
            int d = 2;

            while (true) {
                a -= c;
                if (a < 0) {
                    System.out.println("Harshit");
                    break;
                }
                b -= d;
                if (b < 0) {
                    System.out.println("Aayush");
                    break;
                }
                c += 2;
                d += 2;
            }
        }
    }
}