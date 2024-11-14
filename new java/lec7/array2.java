package lec7;

public class array2 {
    public static void main(String[] args) {
        int num[]={3,2,1,7,8,9,11,3};
        System.out.println(max(num));
        System.out.println(max1(num));

    }
    

    public static int max(int[]num){
        int m=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>m){
                m=num[i];
            }
        }
        return m;
    }
    public static int max1(int num[]){
        int m=Integer.MIN_VALUE;
        for(int i=1;i<num.length;i++){
            m=Math.max(num[i],m);
        }
        return m;
    }
}
