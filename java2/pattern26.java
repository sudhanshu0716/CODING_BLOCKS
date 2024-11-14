public class pattern26{
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
            int num=1;
            while(j<=digit){
                System.out.print(num);
                num++;
                j++;
            }
            space--;
            digit+=2;
            row++;
            System.out.println();
        }
    }
    
}

