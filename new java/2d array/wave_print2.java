import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        if (islower(arr, N)) {
            System.out.println("true");
        } 
        else {
            System.out.println("false");
        }
    }

    private static boolean islower(int[][] arr, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
