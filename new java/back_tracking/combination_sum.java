
package back_tracking;
import java.util.ArrayList;
import java.util.List;

public class combination_sum {
        public static void main(String[] args) {
            int[] coin={1,3,5};
            int amount=6;
            List<Integer> ll=new ArrayList<>();
            List<List<Integer>>ans=new ArrayList<>();
            fun(coin,amount,ll,0);
        }
        public static void fun(int[] coin,int amount,List<Integer> ll,int idx) {
            if(amount==0)
            {
                System.out.println(ll);
                return;
            }
            for(int i=idx;i<coin.length;i++)
            {
                if(amount>=coin[i])
                {
                    ll.add(coin[i]);
                    fun(coin,amount-coin[i],ll,i);
                    ll.remove(ll.size()-1);
                }
            }
        }

}