package group;

import java.util.*;

public class prefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int no_of_strings=sc.nextInt();
        sc.nextLine();
        String  [] arr=new String[no_of_strings];
        int min=Integer.MAX_VALUE;
        for(int i=0; i<no_of_strings;i++){
            arr[i]=sc.nextLine();
            String ans=""+arr[i];
            int count=ans.length();
            if(count<min){
                min=count;
            }
            
        }

        System.out.println(min);
        for(int i=0;i<no_of_strings;i++){
            String_cutter(arr, min);
            System.out.println(arr[i]);
        }

    }
    public static void String_cutter(String []arr,int n){
        for(int i=0;i<arr.length;i++){
            String ans=""+arr[i];
            arr[i]=ans.substring(0,n);
        }
    }

    
}
