package lec7;

import java.util.Scanner;

public class reversible {
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] arr,int a,int b)
    {
        while(a<b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
}