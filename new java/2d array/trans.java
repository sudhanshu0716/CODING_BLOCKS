import java.util.*;
public class trans {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][]arr=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[m][n]=sc.nextInt();

            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[j][i]+" ");

            }
            System.out.println();
        }
        sc.close();
        
    }
}
