public class checker {
    public static void main(String[] args) {
        int a=407;
        int d=3; 
        int sum=0;
        int rem=0;
        while(a>0){
            rem=a%10;
            sum+=Math.pow(rem,d);
            a=a/10;

        }
        System.out.println(sum);
            
    
    }
    
}
