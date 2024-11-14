package lec7;

public class bubblesort2 {
    public static void main(String[] args) {
        int arr[]={1,2,7,2,3,5,4};
        swap(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void swap(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int i=0;i<arr.length-1-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

    }

    
}
