package for_each_loop;

import java.util.ArrayList;

public class for_each {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(20);
        l.add(10);
        l.add(90);
        l.add(230);
        l.add(24);
        for(int i:l){
            System.out.println(i);
        }
    }

}
