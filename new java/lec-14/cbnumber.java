package lec-14;

public class cbnumber {
    public static void main(String[] args) {
        String s="1234";
        int x=Integer.parseInt(s);
        System.out.println(x);
        long l=long.parselong(s);
        System.out.println(l);
    }
    public static
     boolean IsCBnumber(long num){
        if(num==0|| num==1){
            return false;
        }
        int []arr={2,3,5,7,11,13,17,19,23,29};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return false;
            }
            
        }
        for(int i=0;i<arr.length;i++){
            if(num%arr[i]==0){
                return false;
            }
        }
        return true;
    }
    public static boolean iscb(long num) {
        if(num==0 || num==1)
        {
            return false;
        }
        int arr[]={2,3,5,7,11,13,17,19,23,29};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                return true;
            }
        }
        for(int i=0;i<arr.length;i++) 
        {
            if(num%arr[i]==0)
            {
                return false;
            }
        }
        return true;
    }
    public static int countcbnumber(String str) {
        String str="priyansh";
        int c=0;
        for (int len = 1; len <= n; len++) {
            for (int j = len; j <= n ; j++) {
               int i=j-len;
               String s=str.substring(i,j);
               if(iscb(Long.parseLong(s))){
                c++;
               }
            }
        }
    }

}




