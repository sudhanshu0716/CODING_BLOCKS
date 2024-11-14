public class wave_print {
    public static void main(String[] args) {
        int [][]arr={{10,20,30,40,50},{60,70,80,90,71},{110,11,13,16,19},{1,2,3,4,5}};
        waveprint(arr);
    }
    public static void waveprint(int [][]arr){
        for(int col=0;col<arr[0].length;col++){
            if(col%2==0){
                for(int row=0;row<arr.length;row++){
                    System.out.print(arr[row][col]+" ");
                }

            }
            else{
                for(int row=arr.length-1;row>=0;row--){
                    System.out.print(arr[row][col]+" ");
                }
            }
            System.out.println();
        }
    }
    
}
