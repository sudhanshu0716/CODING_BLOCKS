package jan_assignment;

import java.util.*;
public class friends_boundation {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int totalrequest=0;
        for(int i=0;i<arr.length;i++){
            totalrequest=totalrequest+noofrequest(arr,i);
        }
        System.out.print(totalrequest);

    }
    public static boolean validrequest(int []arr,int x,int y){
        if(arr[y]<=0.5*arr[x]+7 || arr[y]>arr[x] || (arr[y]>100 && arr[x]<100)){
          return false;
        }
        else{
          return true;
        }
    }
    public static int noofrequest(int []arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(i==x){
                continue;
            }
            else{
                if(validrequest(arr,x,i)){
                    count++;
                }
            }

        }
        return count;
    }



}
