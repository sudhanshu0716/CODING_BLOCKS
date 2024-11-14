package lec7;

public class insertion {
    public static void main(String[] args) {
        int [] arr={2,4,-5,7,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void insert(int arr[],int i){
        int j=i-1;
        int item=arr[i];
        while(j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=item;
    }
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            insert(arr, i);
        }
    }
    
}
