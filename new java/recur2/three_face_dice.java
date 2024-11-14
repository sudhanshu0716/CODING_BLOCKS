package recur2;

public class three_face_dice {
    public static void main(String[] args) {
        int current=0;
        String ans="";
        int end=4;
        dice(current, end, ans);

    }
    public static void dice(int current,int end,String ans){
        if(current>end){
            return;
        }
        if(current==end){
            System.out.println(ans);
        }
        dice(current+1, end, ans+1);
        dice(current+2, end, ans+2);
        dice(current+3, end, ans+3);
    }
    
}
