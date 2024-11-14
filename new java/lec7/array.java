package lec7;

public class array {
    public static void main(String[] args) {
        int num[]={2,9,15,7,11,8,9,6};
        for(int i=0;i<num.length;i++){
            if(num[i]==7){
                System.out.println(i);
                break;
            }
        }
    }
    
}
