package dp;

import java.util.Arrays;

public class Valentine_Magic {
    public static void main(String[] args) {
        int []boys={2,11,3};
        int []girls={5,7,3,2};
        Arrays.sort(girls);
        Arrays.sort(boys);
        System.out.println(minimum_diff(boys, girls, 0, 0));

    }
    public static int minimum_diff(int []boys,int []girls,int i,int j){
        if(i==boys.length){
            return 0;
        }
        if(j==girls.length){
            return Integer.MAX_VALUE/2; //this statemaent can save us from overflow of int 
        }
        int sel=Math.abs(boys[i]-girls[j])+minimum_diff(boys, girls, i+1, j+1);
        int rej=minimum_diff(boys, girls, i, j+1);
        return (int)Math.min(sel, rej);
    }1
    
}
