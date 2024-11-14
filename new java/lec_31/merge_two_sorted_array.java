package lec_31;

public class merge_two_sorted_array {
    public static void main(String[] args) {
        int []arr1={0,3,4,5,6,7,11,23,32};
        int []arr2={1,2,3,4,6,7,9,77,333};
        int []result=Merge(arr1, arr2);
        for(int i=0; i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] Merge(int []arr1,int[]arr2){
        int n=arr1.length;
        int m=arr2.length;
        int []ans=new int[m+n];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
                k++;
            }
            else{
                ans[k]=arr2[j];
                j++;
                k++;

            }
        }
        while (i<n) {
            ans[k]=arr1[i];
            i++;
            k++;
            
        }
        while(j<m){
            ans[k]=arr2[j];
            j++;
            k++;
          
        }
        return ans;
    }
    
}
