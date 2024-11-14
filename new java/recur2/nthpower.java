package recur2;

public class nthpower {
    public static void main(String[] args) {
        int n=3;
        int m=4;
        System.out.println(power(n, m));
        
    }
    public static int power(int n , int m){
        if(m==0){
            return 1;
        }
        int pow=(m-1);
        int ans=n*power(n,pow);
        return ans;
    }

}
