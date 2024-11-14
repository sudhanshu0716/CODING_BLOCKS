package string_assignment;

import java.util.*;
public class largest_number {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String []arr=new String [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();

        }
        sorting(arr);


    }
    public static void sorting(String []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((Integer.parseInt(arr[i]+arr[j])<Integer.parseInt(arr[j]+arr[i]))){
                    String temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}