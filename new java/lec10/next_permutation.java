package lec10;

public class next_permutation {
    public static void main(String[] args) {
        int arr[]={3,2,8,6,4,2,1};
        permutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void permutation(int arr[]){
        int p=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        
        }
        if(p==-1){
            reverse(arr, 0, arr.length-1);
            return;
        }
        int q=-1;
        for(int i=arr.length-1;i>p;i--){
            if(arr[i]>arr[p]){
                q=i;
                break;
            }

        }
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        reverse(arr,p+1,arr.length-1);
        
    }
    public static void reverse(int[] arr,int a,int b)
    {
        while(a<b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }

    
}
