public class pattern18 {
    public static void main(String[] args) {
        int n=7;
        int star=1;
        int space=3;
        int row=1;
        while(row<=7){
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
            if (row<n/2+1){
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }
            row++;
            System.out.println();
        }

    }
    
}
