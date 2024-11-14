package heap;

import java.util.ArrayList;

public class implementation {
    private ArrayList<Integer>ll=new ArrayList<>();
    public void add(int item){
        ll.add(item);
        unheapify(ll.size()-1);
    }
    public void swap(int i,int j){
        int ith=ll.get(i);
        int jth=ll.get(j);
        ll.set(i,jth);
        ll.set(j, ith);
    }
    private void unheapify(int ci){
        int pi=(ci-1)/2;
        if(ll.get(pi)>ll.get(ci)){
            swap(pi,ci);
            unheapify(pi);
        }
    }
    public int  remove(){
        swap(0, ll.size()-1);
        int rem=ll.remove(ll.size());
        downheapify(0);
        return rem;
    }
    public void downheapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(lci<ll.size() && ll.get(mini)>ll.get(lci)){
            mini=lci;
        }
        if(lci<ll.size() && ll.get(mini)>ll.get(rci)){
            mini=rci;
        }
        if(pi!=mini){
            swap(mini,pi);
            downheapify(mini);
        }
    }
    public int get(){
        return ll.get(0);
    }
    public void Display(){
        System.out.println(ll);
    }
    
}
