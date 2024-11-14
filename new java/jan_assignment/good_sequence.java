package jan_assignment;

import java.util.*;
public class good_sequence {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(count==0||count==2||count==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}