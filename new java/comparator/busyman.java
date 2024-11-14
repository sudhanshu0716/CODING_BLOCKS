package comparator;

import java.util.Comparator;
import java.util.Scanner;

public class busyman {
    static class Pair{
        int st;
        int et;
        public Pair(int st,int et){
            this.st=st;
            this.et=et;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pair []arr=new Pair[n];
        for(int i=0;i<n;i++){
            int st=sc.nextInt();
            int et=sc.nextInt();
            arr[i]=new Pair(st,et);
        }
        Arrays.sort(arr,new Comparator<Pair>() {
            @Override
            

        })
        
    }
    
}
