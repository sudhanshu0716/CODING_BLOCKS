import java.util.*;
public class adjlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<ArrayList<Integer>>ll=new ArrayList<>();
        for(int i=0;i<e;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            addedge(ll,a,b);
        }
    }
    public static void addedge(ArrayList<ArrayList<Integer>>ll,int a,int b){
        ll.get(a).add(b);
        ll.get(b).add(a);
    }
}
