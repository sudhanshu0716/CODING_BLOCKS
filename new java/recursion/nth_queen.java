package recursion;

public class nth_queen {
    public static void main(String[] args) {
        int  n=4;
        int  [][]board=new int [n][n];
        print(board, n, 0);
    }
    public static void print(int [][]board,int tq,int row){
        if(tq==0){
            display(board);
            System.out.println();
            return ;
        }
        for(int col=0;col<board[0].length;col++){
            if(isitsafe(board,row,col)){
                board[row][col]=1;
                print(board, tq-1, row+1);
                board[row][col]=0;
            }
        }
    }
    public static void display(int [][]board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isitsafe(int [][] board ,int row,int col){
        int r=row;
        while(r>=row){
            if(board[r][col]==1){
                return false;
            }
            r--;
        }
        r=row;
        int c=col;
        while(r>=row &&  c>=0){
            if(board[r][c]==1){
                return false;
            }
            r--;
            c--;
        }
        r=row;
        c=col;
        while(r>=0 &&  c<board[0].length){
            if(board[r][c]==1){
                return false;
            }
            r--;
            c++;
        }
        return true;

    
}
}
