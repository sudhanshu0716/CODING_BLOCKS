public class pattern4 {
    public static void main(String[] args) {
        int row=1;
        int n=5;
        int star=1;
        int space=4;
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
            space--;
            row++;
            star++;
            System.out.println();
        }
    }
    
}
