import java.util.*;
public class boston2 {
    public static void main(String args[]) 
    {
    
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        int s=0;
        int t=0;
        int ans=0;
        while(temp>0) {
        	int rem=temp%10;
        	s=s+rem;
        	temp=temp/10;
        	
        }
        // System.out.print(s);
        for(int div=2;div<num;div++) {
        	while(num%div==0) {
        		num=num/div;
        		int t1=div;
        		while(t1>0) {
        		 int tt=t1%10;
        		 t=t+tt;
        		 t1=t1/10;
        		}
       		// System.out.println(div);
        	}
        
        }
        if(num!=1) {
            
        	int k=num;
            // System.out.println(k);
        	while(k>0) {
        		int rem=k%10;
        		sum=sum+rem;
        		k=k/10;
        	}
        	ans=sum+t;
        	// System.out.print(ans);
        }
        if(ans==s){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
}