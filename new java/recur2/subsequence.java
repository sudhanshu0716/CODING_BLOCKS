package recur2;

public class subsequence {
    public static void main(String[] args) {
        String a="abc";
        subsequence(a,"");
        System.out.println(count);

    }
    static int count=0;
    public static void subsequence(String a,String ans){
        if(a.length()==0){
            System.out.print(ans+" ");
            count++;
            return;
        }
        char ch=a.charAt(0);
        subsequence(a.substring(1), ans);
        subsequence(a.substring(1), ans+ch);
    }
    
}
