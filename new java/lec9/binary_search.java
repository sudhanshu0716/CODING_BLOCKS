package lec9;

public class binary_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int item=5;   
        System.out.println(search(arr,item));
    }
    public static int search(int arr[],int item){
        int low=0;
        int high=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==item){
                return mid;
            }
            else if (arr[mid]>item){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;

    }
    
}
