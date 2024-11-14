package jan_assignment;

import java.util.*;
public class mental_math {
    public static void main (String args[]) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        max(arr);
    }
    public static void max(int []arr){
        long product=1;
        Arrays.sort(arr);
        long product2=arr[0]*arr[1]*arr[arr.length-1];
        for(int i=arr.length-1;i>arr.length-4;i--){
            product=product*arr[i];
        }
        System.out.println(Math.max(product,product2));

        

        
    }
}