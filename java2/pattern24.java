public class pattern24{
    public static void main(String[] args) {
        int row=1;
        int n=5;
        int space=4;
        int digit=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;

            }
            int j=1;
            while(j<=digit){
                System.out.print(row);
                j++;
            }
            space--;
            digit+=2;
            row++;
            System.out.println();
        }
    }
    
}

