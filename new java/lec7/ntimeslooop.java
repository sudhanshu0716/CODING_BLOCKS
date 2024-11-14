package lec7;

public class ntimeslooop {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr, k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void rotate(int []arr,int k){
        int b=k%arr.length;
        for(int j=1;j<=b;j++){
            int item=arr[arr.length-1];
            for (int i=arr.length-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=item;
        }



    
    }
}
