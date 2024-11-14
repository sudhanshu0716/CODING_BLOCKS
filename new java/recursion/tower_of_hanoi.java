package recursion;

public class tower_of_hanoi 
    public static void main(String[] args) {
        int n=3;
        String source="A";
        String help="B";
        String destination="C";
        tower_of_hanoi(n, source, help, destination);

    }
    public static void tower_of_hanoi(int n,String source,String help,String destination ){
        if(n==0){
            return ;
        }
        tower_of_hanoi(n-1, source,  destination,help);
        System.out.println("Move "+n+"th disk from "+source+" to "+destination);
        tower_of_hanoi(n-1, help,source, destination);
    }
    
    
}
