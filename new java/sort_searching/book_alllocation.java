package sort_searching;

public class book_alllocation {
    public static void main(String[] args) {
        int []page={10,20,30,40};
        int nos=2;


    }
    public static int minpages(int []page,int nos){
        int lo=0;
        int hi=0;
        for(int i=0;i<page.length;i++){
            hi=hi+page[i];
        }
        int ans=0;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(isitpossible(page,nos,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    
    
}
