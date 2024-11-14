public class pattern16 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int space=4;
        int star=5;
        while(row<=2*n-1){
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
            if (row<=4){
                space--;
                star--;

            }
            else{
                space++;
                star++;
            }
            row++;
            System.out.println();

        }
    }
    
}
