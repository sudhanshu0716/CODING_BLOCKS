package back_tracking;

public class money_counter {
    public static void main(String[] args) {
        int []coin={1,3,5};
        int current=0;
        int end=5;
        money(current, end, "",coin,0);
    }
    public static void money(int current,int end,String ans,int []coin,int idx){
        if(current==end){
            System.out.println(ans);
            return;
        }
        if(current>end){
            return;
        }
        for(int i=idx;i<coin.length;i++){
            money(current+coin[i], end, ans+coin[i], coin,i);
        }

 
    }
    
}
