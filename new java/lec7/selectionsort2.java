package lec7;

public class selectionsort2 {
    public static void main(String[] args) {
        int arr[]={7,3,4,2,2,5,3,7,5,8};
        sort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static int mini(int arr[],int j){
        int min=j;
        for(int i=j+1;i<arr.length;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;

    }
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int b=mini(arr, i);
            int temp=arr[i];
            arr[i]=arr[b];
            arr[b]=temp;
        }
    }
}
