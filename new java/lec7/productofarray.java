package lec7;

public class productofarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int[] b=array_except(arr);
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }

    }
    public static int[] array_except(int arr[]){
        int n=arr.length;
        int left[]=new int[n];
        left[0]=1;
        for(int i=1;i<left.length;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        int right[]=new int [n];
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            left[i]=left[i]*right[i];
        }
        return left;
    }
    
}
