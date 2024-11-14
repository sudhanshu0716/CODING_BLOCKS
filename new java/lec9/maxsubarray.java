package lec9;

public class maxsubarray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subarray(arr));
    }
    public static int subarray(int arr[]){
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }


    
}
