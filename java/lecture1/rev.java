public class rev {
    public static void main(String[]args){
        int a=121;
        int c=a;
        int rem=0;
        int b;
        while(a>0){
            b=a%10;
            rem=rem*10+b;
            a=a/10;


        }
        if (rem==c){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }


    }
}
