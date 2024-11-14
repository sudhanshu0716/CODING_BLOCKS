public class pattern15 {
    public static void main(String[] args) {
        int n=5;
        int star=5;
        int row=1;
        int space=0;
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
            if(row<=n-1){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            row++;
            System.out.println();
        }
        
    }
    
}
