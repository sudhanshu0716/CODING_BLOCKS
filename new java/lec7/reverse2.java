package lec7;

public class reverse2{
    public static void main(String[] args) {
        int arr[]={2,4,5,1,7,9};
        reverse(arr,1,5);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        

    }
    public static void reverse(int num[],int a, int b){
        int x;
        int y;
        for(int i=a;i<b/2;i++){
            x=num[a];
            y=num[b];
            num[a]=x;
            num[b]=y;
            b--;
            
        }
        
    }
    
}