package map;
import java.util.*;
public class hashmap1<K,V> {
    class Node{
        K key;
        V value;
        Node next;
    }
    private ArrayList<Node>bucket;
    
    public HashMap(){
        this.(4);
    }
    public HashMap(int n){
        bucket=new ArrayList<>();
        for(int i=0;i<n;i++){
            bucket.add(null);
        }
    }
}
public void put(K key,V value){
    int idx=hashfun(key);
    Node temp=bucket.get(idx);
    while(temp!=null){
        if(temp.key==key){
            temp.value=value;
            return;
        }
        temp=temp.next;
    }
    temp=bucket.get(idx);
    Node nn=new Node();
    nn.key=key;
    nn.value=value;
    nn.next=temp;
    bucket.set(idx,nn);
    size++;
}
public int Hashfun(K key){
    int bn=key.hashCode()%bucket.size();
    if(bn<0){
        bn+=bucket.size();
    }
    return bn;
}
