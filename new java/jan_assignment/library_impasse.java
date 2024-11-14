package jan_assignment;
import java.util.*;

public class library_impasse {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(leftsum(arr, i)==rightsum(arr, i)){
                System.out.println(i);
            }
            else{
                count++;
            }
        }
        if(count==n){
            System.out.println(-1);
        }
    }
    public static int rightsum(int []arr,int n){
        int rightsum=0;
        for(int i=n+1;i<arr.length;i++){
            rightsum=rightsum+arr[i];
        }
        return rightsum;
    }
    public static int leftsum(int []arr,int n){
        int leftsum=0;
        for(int i=n-1;i>=0;i--){
            leftsum=leftsum+arr[i];
        }
        return leftsum;
    }
    
}
