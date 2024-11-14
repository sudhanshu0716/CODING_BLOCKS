package wrapper_class;

public class first {
    public static void main(String[] args) {
        Integer a=10;
        int a1=10;
        System.out.println(a);
        System.out.println(a1);
        //auto-boxing 
        int b=3;
        Integer b1=30;
        b1=b;
        //un-boxing
        Integer c1=7;
        int c=3;
        c1=c;
        Integer e1=78;//ye heap ke ander jaakar cache m jayega
        Integer e2=78;
        Integer e3=178;//range of integer is from-128 to 127....
        Integer e4=178;//agar iss range se baahar jaenge to heap ke ander duplicacy ka dusra address create hoga 
        System.out.println(e1==e2);
        System.out.println(e3==e4);
        


    }
    
}
