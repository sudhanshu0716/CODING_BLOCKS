public class pattern21 {
    public static void main(String[] args) {
        int row=1;
        int n=5;
        int star=1;
        int space=2*n-3;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            row++;
            star+=1;
            System.out.println();
            space-=2;

        }

    }
}
