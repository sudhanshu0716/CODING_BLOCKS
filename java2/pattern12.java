
public class pattern12
{
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=1;
        int space=n-1;
        while(row<=n)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star)
            {
                while(j<=star)
            {
                if(j%2==0)
                {
                    System.out.print("! ");
                }
                else
                {
                System.out.print("* ");
                }
                j++;
            }
            }
            row++;
            star+=2;
            space--;
            System.out.println();
        }
    }
}
