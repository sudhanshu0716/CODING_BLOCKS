import java.lang.reflect.Array;
import java.util.*;
import java.util.PriorityQueue;
class Pair implements Comparable<Pair>{
    int node;
    int distance;
    public Pair(int n,int d){
        node=n;
        distance=d;
    }
    @Override
    public int compareTo(Pair x){
        return this.distance-x.distance;
    }    
}

public class dijkstra {
    public static int[] dijkstra(int v,ArrayList<ArrayList<ArrayList<Integer>>>adj,int s){
    PriorityQueue<Pair>pq=new PriorityQueue<>();
    int []dis=new int [v];
    Arrays.fill(dis,(int)1e9);
    dis[s]=0;
    pq.add(new Pair(s,dis[s]));
    while(!pq.isEmpty()){
        Pair curr=pq.poll();
        int currnode=curr.node;
        int currdis=curr.distance;
        for(ArrayList<Integer>nbr:adj.get(currnode)){
            int nbrnode=nbr.get(0);
            int nbrwt=nbr.get(1);
            if(dis[nbrnode]>currdis+nbrwt){
                dis[nbrnode]=currdis+nbrwt;
                pq.add(new Pair(nbrnode,dis[nbrnode]));
            }
        }
    }
    return dis;
    }
    
}
