package stack_queue;

public class stack {
    private static final String Throw = null;
    private int []arr;
    private int idx;
    public stack(){
        arr=new int [5];
    }
    public stack(int n){
        arr=new int [n];
    }
    public boolean isEmpty(){
        return idx==0;
    }
    public void push(int item){
        if(isFull()){
            throw new Exception("stack full");
        }
        arr[idx]=item;
        idx++;
    }
    public int pop(){
        if(isEmpty()){
            throw new Exception("stack full");
        }
        idx--;
        return arr[idx];
    }
    public boolean isFull(){
        return idx==arr.length;
    }
    public int size(){
        return idx;
    }
    public int peek(){
        return arr[idx-1];
    }
    public void display(){
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
