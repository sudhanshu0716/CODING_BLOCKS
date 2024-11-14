import java.util.Scanner;

public class patternassignment7 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fir=0;
        int sec=1;
        int row=1;
        int fi=0;
        while(row<=n){
            int i=1;
            while(i<=row){
                System.out.print(fi+"\t");
                i++;
                fi++;
            
            if(row>=2){fi=(fir)+(sec);
            fir=sec;
            sec=fi;}}
            row++;
            System.out.println();
        }
    }
    
}
