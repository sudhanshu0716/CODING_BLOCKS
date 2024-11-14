package jan_assignment;
import java.util.Arrays;
import java.util.Scanner;

public class perance_party {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxsum=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i+=2){
            maxsum=maxsum+arr[i];
        }
        System.out.println(maxsum);
    }
    
}
