package recur2;
public class sequential_digit {
    public static void main(String[] args) {
        int low=100;
        int high=300;
        for(int i=1;i<=9;i++){
            sequence(low, high, i,0);
        }

    }
    public static void sequence(int low,int high,int curr,int ans){
        ans=ans*10+curr;
        if(ans>=low && ans<=high){
            System.out.println(ans);
        }
        if(ans>high || curr==9){
            return;
        }
        sequence(low, high, curr+1, ans);
    }
    
}
