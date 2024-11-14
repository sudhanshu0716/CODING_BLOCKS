package jan_assignment;

import java.util.*;

public class single_in_enginerring_college {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0; i<n;i++){
        arr[i]=sc.nextInt();
    }
    int req=sc.nextInt();
    Arrays.sort(arr);
    int low=arr[0];
    int high=arr[n-1];
    int ans=0;
    while(low<=high){
        int mid=(high-low)/2+low;
        if(remain(arr,mid)>=req){
            low=mid+1;
            ans=mid;
        }
        else{
            high=mid-1;
        }
    }
    System.out.println(ans);


    }
    public static int remain(int []arr,int mid){
        int sum=0;
        for(int i=0; i<arr.length;i++){
            if(mid<arr[i]){
                sum=sum+(arr[i]-mid);
            }
        }
        return sum;
    }

    
}
