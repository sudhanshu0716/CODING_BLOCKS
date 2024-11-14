package lec13;

public class string {
    public static void main(String[] args) {
        String str1="hello";//string pool or intern pool m value store hogi ye baar baar use ho skta h
        String str2="hello";//string pool or intern pool m value store hogi ye baar baar use ho skta h
        String str3=new String("hello");//string pool or intern pool m value store nhi hogi ye baar baar use nhi ho skta 
        String str4 =new String("hello");//string pool or intern pool m value store nhi hogi ye baar baar use ho nhi skta h
        System.out.println(str1==str3);
        System.out.println(str1==str2);
        System.out.println(str3==str4);
        System.out.println(str1);
        str1=str1+" bye";//jb plus sign use krte h tb new keyword khud use ho jata h
        System.out.println(str1);
        String s1="kaju"+"kamlesh";//isme plus sign ka mtlb khatam ho jata h
        System.out.println();
    }
    
}

