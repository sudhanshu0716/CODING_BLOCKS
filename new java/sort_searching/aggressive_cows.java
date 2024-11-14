package sort_searching;
import java.util.*;

public class aggressive_cows {
    public static void main(String[] args) {
        int[]stall={1,2,8,4,9,};
        int noc=3;
        Arrays.sort(stall);
        System.out.println(largest_distance(stall, noc));
    }
    public static int largest_distance(int[] stall,int noc){
        int lo=stall[0];
        int hi=stall[stall.length-1];
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isitpossible(stall,noc,mid)){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
            
        }
        return ans;

    }
    public static boolean isitpossible(int[] stall,int noc,int mid){
        int pos=stall[0];
        int c=1;
        for(int i=0;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                c++;
                pos=stall[i];
            }
            if(c==noc){
                return true;
            }

        }
        return false;
    }


}
