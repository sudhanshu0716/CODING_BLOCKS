import java.util.Arrays;
import java.util.Comparator;

public class kruskal {
    static int[]rank;
    static int[]parent;
    static int res=0;
    public static void main(String[] args) {
        int [][]arr={{0,1,2},{0,3,6},{1,3,8},{1,4,5},{1,2,3},{2,4,7}};
        int v=6;
        parent=new int [v];
        rank=new int [v];
        for(int i=0;i<v;i++){
            parent[i]=i;
            rank[i]=1;
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[2]));
        for(int i=0;i<v;i++){
            union(arr[i][0],arr[i][1],arr[i][2]);
        }
        System.out.println(res);
    }
    public static int find(int n){
        if(parent[n]==n){
            return n;
        }
        return parent[n]=find(parent[n]);
    }
    public static void union(int u,int v,int canbe){
        int ulp_u=find(u);
        int ulp_v=find(v);
        if(ulp_u==ulp_v){
            return;
        }
        else {
            res=res+canbe;
            if (rank[ulp_u] >= rank[ulp_v]) {
                parent[ulp_v]=ulp_u;
                rank[ulp_u]++;
            } else {
                parent[ulp_u] = ulp_v;
                rank[ulp_v]++;
            }
        }
    
    }
    
}
