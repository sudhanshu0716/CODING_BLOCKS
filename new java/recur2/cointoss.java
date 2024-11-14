package recur2;

public class cointoss {
    public static void main(String[] args) {
        int n=3;
        toss(n,"");

    }
    public static void toss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
            }
        
        if(ans.length()==0 ||ans.charAt(ans.length()-1)!='H' ){
            toss(n-1,ans+"H");
        }
        toss(n-1, ans+"T");
    }
    }
    
    

