package simple;

import lec7.insertion;

public class test3 {
    public static void main(String[] args) {
        int []arr={1,2,2,3,3,22,34,4,4322,4};
        System.out.println(unique(arr));
        
    }
    public static int unique(int []arr){
        int count =0;
        for(int i=0; i<arr.length-1;i++){
            while(arr[i]==arr[i+1]){
                i++;
            }
            count++;
        }
        return count;
    }

    
}
