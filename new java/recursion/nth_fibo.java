package recursion;

public class nth_fibo {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibo(n));

    }
    public static int fibo(int n){
        if(n==1||n==0){
            return n;
        }
        int f1=fibo(n-1);
        int f2=fibo(n-2);
        return f1+f2;
    } 
    
}
