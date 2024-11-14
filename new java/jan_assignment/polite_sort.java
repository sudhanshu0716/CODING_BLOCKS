package jan_assignment;

import java.util.*;
public class polite_sort {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int []ar2=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            ar2[i]=arr[i];
        }
        Arrays.sort(ar2);
        int count=0;
        for(int i=0; i<n;i++){
            if(arr[i]!=ar2[i]){
                count++;
            }
        }
        System.out.println(count);

    }
}