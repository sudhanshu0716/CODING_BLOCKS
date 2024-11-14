package lec7; 

public class water {
    public static void main(String[] args) {
        int arr[]={1,5,7,9,3,2,6,8};
        System.out.print(maxwater(arr));

    }
    public static int maxwater(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int a=arr[j];
                int b=arr[i];
                int c=j-i;
                int d=c*Math.min(a, b);
                if(d>max){
                    max=d;
                }
            }
        }
        return max;
    }
    
}
