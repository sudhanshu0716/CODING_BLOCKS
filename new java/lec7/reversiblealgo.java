package lec7;

public class reversiblealgo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        

        }
        
        
    
    public static void rotate_array(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void reverse(int[] arr,int a,int b)
    {   int i=a;
        int j=b;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
}
