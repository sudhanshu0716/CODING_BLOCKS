package Interface;

public class car_client {
    public static void main(String[] args) {
        cars[]arr=new cars[5];
        arr[0]=new cars(200,10,"white");     
        arr[1]=new cars(1000,20,"black"); 
        arr[2]=new cars(345, 3, "yellow"); 
        arr[3]=new cars(34,89,"grey"); 
        arr[4]=new cars(99,6,"red");
        sort(arr);
        Display(arr);
    }
    public static void Display(cars[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static <t extends Comparable<t>>void sort(t []arr){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int i=0;i<arr.length-1-turn;i++){
                if(arr[i].compareTo(arr[i+1])>0){
                    t temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

    }
    
}
