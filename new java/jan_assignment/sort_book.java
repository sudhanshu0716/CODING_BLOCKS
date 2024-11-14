import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        char []arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextChar();
        }
        int countp=0;
        int countc=0;
        int countm=0;
        for(int i=0; i<n;i++){
            if(arr[i]=='P'){
                countp++;
            }
            else if(arr[i]=='C'){
                countc++;
            }
            else{
                countm++;
            }
        }
        System.out.print("P "*countp+"C "*countc+"M "*(countm-1));
        System.out.print("M");


    }
}