package recursion;
import java.*;

public class queen_permutation{
    //
    public static void main(String[] args) {
        int n=4;
        boolean []board=new boolean[n];
        int tq=2;
        queenbethaiye(board, tq, 0,"");
    }
    public static void queenbethaiye(boolean[] board, int tq, int qpsf,String ans){
        if(tq==qpsf){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                queenbethaiye(board, tq, qpsf+1, ans+"b"+i+"Q"+qpsf);
            }
        }
    }
}