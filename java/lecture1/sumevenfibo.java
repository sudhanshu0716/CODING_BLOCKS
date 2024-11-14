public class sumevenfibo {
    public static void main(String[]args){
        int a=12;
        int x=0;
        int y=1;
        int count=0;
        int sum=0;
        int sum2=0;
        while(count<=a){
            sum=x+y;
            if(sum%2==0){
                sum2=sum2+sum;
            }
            x=y;
            y=sum;
            count++;



        }
        System.out.println(sum2);

    }
}
