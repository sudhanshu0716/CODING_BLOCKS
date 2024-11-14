package recursion;

public class linear_search {
    public static void main(String[] args) {
        int arr[]={1,3,2,3,2,5,8,6,5};
        int n=5;
        System.out.println(find(arr,n,0));
    }
    public static int find(int []arr,int n,int idx){
        if(arr[idx]==n){
            return idx;
        }
        return find(arr, n, idx+1);
    }
    
}
