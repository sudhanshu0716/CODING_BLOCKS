package lec10;

public class bad_version {
    public static void main(String[] args) {
        
    }
    public static int firstbadversion(int n){
        int low=1;
        int high=n;
        int ans=0;
        while(low<=high){
            int mid=(high+low)/2;
            if(isbadversion(mid)){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
            return ans;

        }
    }

}
