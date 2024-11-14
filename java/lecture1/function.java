public class function {
static int val=100;
    public static void main(String[] args) {
        System.out.println("hey");
        int a =8;
        int b=7;
        System.out.println(val);
        System.out.println(add(a,b));
    }
    public static int add(int a,int b){
        int c=a+b;
        int x=sub(a,c);
        val=val+5;
        return x+c;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    
}
