import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int m=qw.nextInt();
        int n=qw.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=qw.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
}
