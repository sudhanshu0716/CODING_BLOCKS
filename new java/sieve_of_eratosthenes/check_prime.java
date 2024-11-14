package sieve_of_eratosthenes;

public class check_prime {
    public static void main(String[] args) {
        System.out.println(prime_sieve(10));
        
    }
    //true=>not prime
    //false=>>prime
    public static int  prime_sieve(int n){
        int count=0;
        boolean []prime=new boolean [n+1];
        prime[0]=true;//not prime
        prime[1]=true;
        for(int i=2;i<prime.length;i++){
            if(prime[i]==false){
                for(int j=2;i*j<prime.length;j++){
                    prime[i*j]=true;
                }
            }
            if(prime[i]==false){
                count++;
            }
        }
        return count;
    }
    
}
