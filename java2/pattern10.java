public class pattern10 {
    public static void main(String[] args) {
        int row=1;
        int n=5;
        int star=9;
        int  space=0;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;

            }
            int j=1;
            while(j<=star){
                System.out.print("*");
                j++;
            }
            row++;
            space++;
            star-=2;
            System.out.println();
        }
    }
    
}
