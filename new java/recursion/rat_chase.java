package recursion;
import java.util.*;

public class rat_chase {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][]maze=new char[n][m];
        for(int i=0;i<maze.length;i++){
            String s=sc.next();
            for(int j=0;j<s.length();j++){
                maze[i][j]=s.charAt(j);
            }
        }
        print(maze, 0, 0);
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                System.out.println(maze[i][j]);
            }
        }

    }
    public static void print(char[][]maze,int cr,int cc){
        if(cr<0 ||cr>=maze.length || cc<0 || cc>=maze[0].length || maze[cr][cc]=='X' || maze[cr][cc]=='1'){
            return;
        }
        maze[cr][cc]='1';
        print(maze, cr-1, cc);//up
        print(maze, cr, cc-1);//left
        print(maze, cr+1, cc);//down
        print(maze, cr, cc+1);//right
        maze[cr][cc]='O';

    }
    
}
