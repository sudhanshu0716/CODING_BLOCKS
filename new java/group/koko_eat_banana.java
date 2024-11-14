package group;

import java.util.*;

public class koko_eat_banana {
    public static void main(String[] args) {
        int [] pile={3,11,6,7};
        int hours=8;
        Arrays.sort(pile);
        int low=1;
        int mid=0;
        int high=pile[pile.length-1];
        while(low<=high){
            mid=(high-low)/2+low;
            if(big_loop(pile, mid)<=hours){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(low);

    }
    public static int  small_loop(int n ,int k){
        int  count=0;
        while(n>0){
            n=n/k;
            count++;
        }
        return count;
        
    }
    public static int big_loop(int []arr,int k){
        int bigcount=0;
        for(int i=0; i<arr.length;i++){
            bigcount=bigcount+small_loop(arr[i], k);
        }
        return bigcount;//bigcount means total count using a k
    }
    
}
