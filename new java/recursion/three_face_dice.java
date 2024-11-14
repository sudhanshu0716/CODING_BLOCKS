package recursion;

public class three_face_dice {
    public static void main(String[] args) {
        int n=4;
        printpath(n, 0,"");
        
    }
    public static void printpath(int n,int curr,String ans){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        if(curr>n){
            return;
        }
        for(int dice=1;dice<=3;dice++){
            printpath(n, curr+dice, ans+dice);
        }


    }
}
