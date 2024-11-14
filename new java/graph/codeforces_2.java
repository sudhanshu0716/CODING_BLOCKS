import java.util.*;
public class codeforces_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int edges = sc.nextInt();
        ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
        for (int i = 0; i <= n; i++) { 
            ll.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ll.get(x).add(y);
            ll.get(y).add(x);
        }
        int[] arr = new int[n + 1]; 
        for (int i = 1; i <= n; i++) { 
            arr[i] = ll.get(i).size();
        }
        Arrays.sort(arr);
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 1; i <= n; i++) { 
            ts.add(arr[i]);
        }
        if (ts.size()==2 && ts.first()==1 && ts.last()==n-1) {
            System.out.println("star topology");
        } 
        else if (ts.size() == 1 && ts.first() == 2) {
            System.out.println("ring topology");
        } 
        else if(ts.size()==2  && ts.last()==2 && ts.first() == 1) {
            System.out.println("bus topology");
        }
        else {
            System.out.println("unknown topology");
        }
    }
}
