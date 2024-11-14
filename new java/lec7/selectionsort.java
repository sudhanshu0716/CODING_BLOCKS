package lec7;

public class selectionsort {
    public static void main(String[] args) {
        int arr[]={3,2,6,-4,5};
        selectsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectsort(int arr[]){
        int mini=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[mini]>arr[j]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }
    
}
