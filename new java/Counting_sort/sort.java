package Counting_sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int []arr={1,3,5,6,3,6,8,4,3,2,8,3,3,1,1,3,6,3,9,3};
        int max=Arrays.stream(arr).max().getAsInt();
        int []len=new int [max+1];
        for(int i=0;i<arr.length;i++){
            len[arr[i]]++;
        }
    }
    
}
