package lec8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int output = calculateOutput(a, b, c, l, r);
            System.out.println(output);
        }
    }

    private static int calculateOutput(int a, int b, int c, int l, int r) {
		int q=l*l*a+l*b+c;
        return q;
    }
}

