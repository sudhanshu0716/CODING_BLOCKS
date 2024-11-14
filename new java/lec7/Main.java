import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner we = new Scanner(System.in);
        long t = we.nextLong();
        while (t-- > 0) {
            long n = we.nextLong();
            long m = we.nextLong();
            long[] a = new long[(int) n];
            long[] b = new long[(int) m];
            for (int i = 0; i < n; i++) {
                a[i] = we.nextLong();
            }
            for (int i = 0; i< m; i++) {
                b[i] = we.nextLong();
            }

            long i = 0;
            long j = 0;
            long qwe = 0;
            long xyz = 0;
            long thrice = 0;

            while (i < n&& j <m) {
                if (a[(int) i] < b[(int) j]) {
                    qwe += a[(int) i++];
                } else if (a[(int) i] > b[(int) j]) {
                    xyz += b[(int) j++];
                } else {
                    thrice += Math.max(qwe, xyz) + a[(int) i];
                    i++;
                    j++;
                    qwe= 0;
                    xyz = 0;
                }
            }

            while (i < n) {
                qwe += a[(int) i++];
            }

            while (j < m) {
                xyz += b[(int) j++];
            }

            thrice += Math.max(qwe, xyz);
            System.out.println(thrice);
        }
    }        
}
