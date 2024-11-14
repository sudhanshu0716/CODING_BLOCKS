package jan_assignment;

import java.util.*;
public class angry_thanos {
    public static void main (String args[]) {
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
            int a=counter(arr,i);
            if(a>=1){
                System.out.print(arr[i]+" ");
            }
            i+=a;
        }


    }
    public static int counter(int[]arr,int i){
        int count=0;
        while(i<arr.length-1 && arr[i]==arr[i+1]){
            count++;
            i++;
        }
        return count;
    }
}
