import java.util.Scanner;

public class majority_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr = new int  [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>(n/2)){
                System.out.print(arr[i]);
                
            }
        }


    }
    
}
