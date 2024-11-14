import java.util.Scanner;

public class patternassignment9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int digit=1;
        int value=0;
        while(row<=n){
            int i=1;
            while(i<=digit){
                if(i==1 || i==row){
                    System.out.print(row+"\t");
                    i++;
                }
                else{
                    System.out.print(value+"\t");
                    i++;
                }
            }
            digit++;
            row++;
            System.out.println();
        }


    }
    
}
