package linked_list;
public class linked_list {
    class Node {
        int val;
        Node Next;
    }
    private Node head;
    private Node tail;
    private int size;
    public void addFirst(int item) {
        Node newnode = new Node();
        newnode.val = item;
        if (size == 0) {
            head = newnode;
            tail = newnode;
            size++;
        } 
    
    }
    public int removefirst(){
        int rem=head.val;
        if(size==0){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
    }
}
