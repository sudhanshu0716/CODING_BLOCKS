package lec13;

public class string_lexicographically {
    public static void main(String[] args) {
        String s1="ramesh";
        String s2="rajesh";
        compare(s1, s2);
        // System.out.println(s1.compareTo(s2));//ascii value compare hoti h
    }
    public static void compare(String s1,String s2){
        int c=Math.min(s1.length(),s2.length());
        for(int i=0;i<c;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                continue;
            }
            else if(s1.charAt(i)>s2.charAt(i)){
                System.out.println(s2);
            }
            else if(s1.charAt(i)<s2.charAt(i)){
                System.out.println(s1);
            }
        }
    }
    
}
