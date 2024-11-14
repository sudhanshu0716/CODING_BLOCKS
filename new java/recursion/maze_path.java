package recursion;

public class maze_path {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        path( n-1, m-1, 0, 0,"");
    }
    public static void path(int end_row,int end_col,int curr_row,int curr_col,String ans ){
        if(curr_row==end_row){
            System.out.println(ans);
            return;
        }
        if (curr_row>end_row || curr_col>end_col) {
            return;
            
        }
        path(end_row, end_col, curr_row, curr_col+1, ans+"H");
        path(end_row, end_col, curr_row+1, curr_col, ans+"V");

    }

    
}
