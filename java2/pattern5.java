public class pattern5 {
    public static void main(String[] args) {
        int row=1;
        int n=5;
        int space=0;
        int star=5;
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
            space++;
            star--;
            row++;
            System.out.println();

        }
        }
    }
    

