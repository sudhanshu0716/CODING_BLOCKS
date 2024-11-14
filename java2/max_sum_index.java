
    import java.util.Scanner;

public class max_sum_index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];

       
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int j = 0; j < N; j++) {
            int columnSum = 0;
            for (int i = 0; i < N; i++) {
                columnSum += matrix[i][j];
            }
            if (columnSum > maxSum) {
                maxSum = columnSum;
                maxIndex = j;
            }
        }

        System.out.println("The index of the column with maximum sum is: " + maxIndex);
    }
}


