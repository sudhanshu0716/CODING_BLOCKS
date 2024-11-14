package jan_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class leader_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(arr[n-1]);
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }


    }

    
}
