package lec8;

public class kroot_binary {
    public static void main(String[] args) {
        int n=146;
        int k=3;
        System.out.println(kthroot( n, k));
    }
    public static int kthroot(int n,int k){
        int low=0;
        int ans=0;
        int high=n;
        while(low<=high){
            int mid=(low+high)/2;
            if (Math.pow(mid,k)<=n){
                ans=mid;
                low=mid+!;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
