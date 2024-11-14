package lec7;

public class reverse {
    public static void main(String[] args) {
        int arr[]={2,4,5,1,7,9};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        

    }
    public static void reverse(int num[]){
        int a=0;
        int b=0;
        for(int i=0;i<num.length/2;i++){
            a=num[i];
            b=num[(num.length-i)-1];
            num[i]=b;
            num[(num.length-i)-1]=a;
        }
        
    }
    
}
