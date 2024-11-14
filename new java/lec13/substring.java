package lec13;

public class substring {
    public static void main(String[] args) {
        String s="abc";
        substringwa(s);

        // System.out.println(s.substring(1,4));
        // System.out.println(s.substring(3,3));
    }
    public static void substringwa(String s1){
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<=s1.length();j++){
                System.out.print(s1.substring(i,j)+" ");
                                                         
        }
        System.out.println();
        }
    }
    
}

