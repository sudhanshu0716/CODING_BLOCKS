package simple;

public class check_prime {
    public static void main(String[] args) {
        int n=25;
        System.out.println(check_prime(n));
    }
    public static boolean check_prime(int n){
        int div=2;
        while(div*div<=n){
            if(n%div==0){
                return false;
            }
            div++;
        }
        return true;
    }
    
}
