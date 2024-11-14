package lec_31;

public class partition_in_array {
    public static void main(String[] args) {
        int []arr={5,7,2,1,8,3,4};
        int idx=
    }
    public static int Partition(int[]arr,int start,int end){
        int item=arr[end];
        int idx=start;
        for(int i=start;i<end;i++){
            if(arr[i]<=item){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }
        }
        int temp=arr[idx];
        arr[]

    }

}
