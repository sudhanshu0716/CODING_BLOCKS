package lec9;
import java.util.Scanner;

public class kthroots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();  // Use long instead of int
            int k = sc.nextInt();
            System.out.println(kroot(n, k));
        }
    }

    public static long kroot(long n, int k) {
        long low=0;
        long high =n;
        long  ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(Math.pow(mid,k)<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return ans;
    }
}
