package lec7;

import java.util.Scanner;

public class traprainwater {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int[] arr=new int [a];
            for(int j=0;j<a;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(trap(arr));
        }

    }
    public static int trap(int []arr){
        int sum=0;
        int n=arr.length;
        int [] left=new int [n];
        left[0]=arr[0];
        for(int i=1;i<left.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        int right[]=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+Math.min(left[i],right[i])-arr[i];
        }
        return sum;

    }
}
