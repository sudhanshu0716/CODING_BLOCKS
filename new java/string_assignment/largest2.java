package string_assignment;

import java.util.*;
public class largest2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        for(int k=0;k<tt;k++){
            int n=sc.nextInt();
        String []arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(Long.parseLong(arr[i]+arr[j])<Long.parseLong(arr[j]+arr[i])){
                    String tem=arr[j];
                    arr[j]=arr[i];
                    arr[i]=tem;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        }
    }
}
