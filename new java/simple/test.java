package simple;
import java.util.*;
public class test {
        public static void main(String args[]) {
            Scanner sc=new Scanner (System.in);
            String s=sc.nextLine();
            char[] arr=new char[s.length()];
            order(s, 0, arr);
            Arrays.sort(arr);
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i]);
            }
        }
        public static void order(String s,int idx,char []arr){
            if(idx<s.length()){
                arr[idx]=s.charAt(idx);
            }
            if(idx==s.length()){
                return;
            }
            order(s,idx+1,arr);
        }
    }
    


