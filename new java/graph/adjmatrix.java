import java.util.*;
public class adjmatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int [][]arr=new int [v][v];
        for(int i=0;i<e;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            addedge(arr, a, b);
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void addedge(int [][]arr,int a,int b){
        arr[a][b]=1;
        arr[b][a]=1;
    }
}