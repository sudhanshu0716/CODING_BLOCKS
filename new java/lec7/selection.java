package lec7;

public class selection {
    public static void main(String[] args) {
        int arr[]={2,4,5,1,7,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int min_index(int arr[],int i){
        int mini=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[mini]){
                mini=j;
            }
        }
        return mini;
    }
    public static void  sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int idx=min_index(arr, i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;

        }
        
    }

    
}
