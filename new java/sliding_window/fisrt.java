package sliding_window;

import java.util.ArrayList;
import java.util.Collections;

public class fisrt {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int[] result = diagonal(arr);
        for(int i : result) {
            System.out.print(i + " ");}

        
    }
    public static int [] diagonal(int [][]arr){
        int n =arr.length;
        int m =arr[0].length;
        int [] ans=new int [m*n];
        int index=0;
        for(int d=0;d<m+n-1;d++){
            int r=0;
            int c=0;
            if(d<m){
                c=d;
            }
            else{
                c=m-1;
                r=d-m+1;
            }
            ArrayList <Integer> ll=new ArrayList<>();
            while(r<n && c>=0){
                ll.add(arr[r][c]);
                r++;
                c--;
            }
            if(d%2==0){
                Collections.reverse(ll);
            }
            for(int j=0;j<ll.size();j++){
                ans[index++]=ll.get(j);
            }
        }
        return ans;
    }
    
}
