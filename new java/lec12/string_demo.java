package lec13;

public class string_demo {
    public static void main(String[] args) {
        String s1="hello";
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        String s2=new String("hello");
        equal(s1, s2);
        

    }
    public static void equal(String a1,String a2){
        if(a1.length()==a2.length()){
            int count=0;
        for (int i=0;i<a2.length();i++){
            if(a1.charAt(i)==a2.charAt(i)){
                count++;
            }
        }
        if(count==a1.length()){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        }
        else{ System.out.println("not equal");}
    }
    
}
