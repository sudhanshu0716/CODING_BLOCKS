package lec7;

public class sum3{
    public static void main(String args[]){
        int arr[]={-1,0,1,2,-1,-4};
        sumthree(arr);
    }
    public static void sumthree(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if((arr[i]+arr[j]+arr[k])==0){
                        System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                        }
                    }
                }

            }
        }
    }
    

