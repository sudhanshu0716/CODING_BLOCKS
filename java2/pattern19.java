public class pattern19 {
    public static void main(String[] args) {
        //code mai ek galti h!!
        //ab shi h!!
        int n=7;
        int row=1;
        int star=n/2+1;
        int space=-1;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            int j=1;
            while(j<=(space)){
                System.out.print(" ");
                j++;
            }
            int k=1;
            if (row==1 || row==n){
                k=2;
            }
            while(k<=star){
                System.out.print("*");
                k++;
            }
            //<= to +1 nhi likhna
            if(row<n/2+1){
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
