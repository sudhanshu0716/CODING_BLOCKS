public class pattern6 {
    public static void main(String args[]){
        int row=1;
        int n=5;
        int space=0;
        int star=n;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            row++;
            star--;
            space+=2;
            System.out.println();
        }




    }
    
}
